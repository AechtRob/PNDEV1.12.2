package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraApateon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelApateon extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer forewingright;
    private final AdvancedModelRenderer forewingleft;
    private final AdvancedModelRenderer hindwingright;
    private final AdvancedModelRenderer hindwingleft;
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer lowerarmleft;
    private final AdvancedModelRenderer upperarmright2;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer lowerarmright;
    private final AdvancedModelRenderer upperarmleft2;
    private final AdvancedModelRenderer gillright;
    private final AdvancedModelRenderer gillleft;
    private final AdvancedModelRenderer gillright2;
    private final AdvancedModelRenderer gillleft2;
    private final AdvancedModelRenderer gillright3;
    private final AdvancedModelRenderer gillleft3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    private ModelAnimator animator;

    public ModelApateon() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, -4.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.base.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.25F, 2.75F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -1.5F, -0.5F, -3.0F, 3, 1, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.25F, 2.75F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 17, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-1.5F, -0.15F, 2.0F);
        this.hips.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.0873F, 0.1745F, -0.3491F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 26, 8, -1.25F, -0.55F, -0.75F, 2, 1, 1, 0.01F, false));
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 24, 12, -1.25F, -0.55F, -0.3F, 2, 1, 1, 0.0F, false));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(-1.1F, 0.0F, 0.15F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, -0.0436F, 0.829F, -0.2182F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 27, 0, -2.0F, -0.5F, -0.65F, 2, 1, 1, -0.01F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.3491F, 0.0F, 0.4363F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.0F, -7.5F);
        this.footright.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 0, -4.25F, 0.0F, 4.75F, 3, 0, 3, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(1.5F, -0.15F, 2.0F);
        this.hips.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.0873F, -0.1745F, 0.3491F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 26, 8, -0.75F, -0.55F, -0.75F, 2, 1, 1, 0.01F, true));
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 24, 12, -0.75F, -0.55F, -0.3F, 2, 1, 1, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(1.1F, 0.0F, 0.15F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, -0.0436F, -0.829F, 0.2182F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 27, 0, 0.0F, -0.5F, -0.65F, 2, 1, 1, -0.01F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.3491F, 0.0F, -0.4363F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, -7.5F);
        this.footleft.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, 1.25F, 0.0F, 4.75F, 3, 0, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.75F, 2.5F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 22, 3, -1.0F, -1.25F, 0.0F, 2, 2, 3, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 21, 0.0F, -1.75F, 0.0F, 0, 3, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 3, 24, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 22, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 23, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 16, 0.0F, -1.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.5F, -4.75F, 4, 3, 5, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -4.8F);
        this.body.addChild(chest);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 1.0F, -1.5F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 27, -1.6F, -2.0F, -2.25F, 1, 2, 2, -0.02F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 27, -1.1F, -2.0F, -2.25F, 1, 2, 2, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 1.0F, -1.5F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 27, 0.6F, -2.0F, -2.25F, 1, 2, 2, -0.02F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 27, 0.1F, -2.0F, -2.25F, 1, 2, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 10, -2.0F, -0.5F, 0.0F, 4, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 8, -2.0F, -2.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.forewingright = new AdvancedModelRenderer(this);
        this.forewingright.setRotationPoint(-0.75F, -1.3F, -1.5F);
        this.chest.addChild(forewingright);
        this.setRotateAngle(forewingright, 0.4363F, 1.0036F, 0.3491F);
        this.forewingright.cubeList.add(new ModelBox(forewingright, -5, 31, -10.0F, 0.0F, -0.5F, 10, 0, 5, 0.0F, false));

        this.forewingleft = new AdvancedModelRenderer(this);
        this.forewingleft.setRotationPoint(0.75F, -1.3F, -1.5F);
        this.chest.addChild(forewingleft);
        this.setRotateAngle(forewingleft, 0.4363F, -1.0036F, -0.3491F);
        this.forewingleft.cubeList.add(new ModelBox(forewingleft, -5, 31, 0.0F, 0.0F, -0.5F, 10, 0, 5, 0.0F, true));

        this.hindwingright = new AdvancedModelRenderer(this);
        this.hindwingright.setRotationPoint(-0.75F, -1.3F, -0.5F);
        this.chest.addChild(hindwingright);
        this.setRotateAngle(hindwingright, 0.3054F, 1.1781F, 0.2182F);
        this.hindwingright.cubeList.add(new ModelBox(hindwingright, -5, 31, -10.0F, 0.0F, -0.5F, 10, 0, 5, 0.0F, false));

        this.hindwingleft = new AdvancedModelRenderer(this);
        this.hindwingleft.setRotationPoint(0.75F, -1.3F, -0.5F);
        this.chest.addChild(hindwingleft);
        this.setRotateAngle(hindwingleft, 0.3054F, -1.1781F, -0.2182F);
        this.hindwingleft.cubeList.add(new ModelBox(hindwingleft, -5, 31, 0.0F, 0.0F, -0.5F, 10, 0, 5, 0.0F, true));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-2.0F, 0.85F, -1.45F);
        this.chest.addChild(upperarmright);
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 26, 18, -1.5F, -0.55F, -0.25F, 2, 1, 1, 0.01F, false));

        this.lowerarmleft = new AdvancedModelRenderer(this);
        this.lowerarmleft.setRotationPoint(-1.35F, 0.0F, 0.4F);
        this.upperarmright.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -0.0436F, -0.6981F, -0.6545F);
        this.lowerarmleft.cubeList.add(new ModelBox(lowerarmleft, 0, 28, -2.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.upperarmright2 = new AdvancedModelRenderer(this);
        this.upperarmright2.setRotationPoint(-2.0F, 0.25F, 0.0F);
        this.lowerarmleft.addChild(upperarmright2);
        this.setRotateAngle(upperarmright2, 0.4102F, 0.0F, 0.5847F);
        this.upperarmright2.cubeList.add(new ModelBox(upperarmright2, 10, 0, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(2.0F, 0.85F, -1.45F);
        this.chest.addChild(upperarmleft);
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 26, 18, -0.5F, -0.55F, -0.25F, 2, 1, 1, 0.01F, true));

        this.lowerarmright = new AdvancedModelRenderer(this);
        this.lowerarmright.setRotationPoint(1.35F, 0.0F, 0.4F);
        this.upperarmleft.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, -0.0436F, 0.6981F, 0.6545F);
        this.lowerarmright.cubeList.add(new ModelBox(lowerarmright, 0, 28, 0.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.upperarmleft2 = new AdvancedModelRenderer(this);
        this.upperarmleft2.setRotationPoint(2.0F, 0.25F, 0.0F);
        this.lowerarmright.addChild(upperarmleft2);
        this.setRotateAngle(upperarmleft2, 0.4102F, 0.0F, -0.5847F);
        this.upperarmleft2.cubeList.add(new ModelBox(upperarmleft2, 10, 0, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.gillright = new AdvancedModelRenderer(this);
        this.gillright.setRotationPoint(-2.0F, -0.5F, -3.0F);
        this.chest.addChild(gillright);
        this.setRotateAngle(gillright, 0.0F, 0.1745F, 0.4363F);
        this.gillright.cubeList.add(new ModelBox(gillright, 22, 10, -3.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.gillleft = new AdvancedModelRenderer(this);
        this.gillleft.setRotationPoint(2.0F, -0.5F, -3.0F);
        this.chest.addChild(gillleft);
        this.setRotateAngle(gillleft, 0.0F, -0.1745F, -0.4363F);
        this.gillleft.cubeList.add(new ModelBox(gillleft, 22, 10, 0.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.gillright2 = new AdvancedModelRenderer(this);
        this.gillright2.setRotationPoint(-2.0F, -0.25F, -3.0F);
        this.chest.addChild(gillright2);
        this.setRotateAngle(gillright2, 0.0F, 0.3491F, 0.3054F);
        this.gillright2.cubeList.add(new ModelBox(gillright2, 20, 15, -3.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.gillleft2 = new AdvancedModelRenderer(this);
        this.gillleft2.setRotationPoint(2.0F, -0.25F, -3.0F);
        this.chest.addChild(gillleft2);
        this.setRotateAngle(gillleft2, 0.0F, -0.3491F, -0.3054F);
        this.gillleft2.cubeList.add(new ModelBox(gillleft2, 20, 15, 0.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.gillright3 = new AdvancedModelRenderer(this);
        this.gillright3.setRotationPoint(-2.0F, 0.0F, -3.0F);
        this.chest.addChild(gillright3);
        this.setRotateAngle(gillright3, 0.0F, 0.5236F, 0.2182F);
        this.gillright3.cubeList.add(new ModelBox(gillright3, 14, 15, -3.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.gillleft3 = new AdvancedModelRenderer(this);
        this.gillleft3.setRotationPoint(2.0F, 0.0F, -3.0F);
        this.chest.addChild(gillleft3);
        this.setRotateAngle(gillleft3, 0.0F, -0.5236F, -0.2182F);
        this.gillleft3.cubeList.add(new ModelBox(gillleft3, 14, 15, 0.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -3.5F);
        this.chest.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 8, 15, -1.0F, -1.0F, -3.75F, 2, 1, 4, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 1.0F, -3.75F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 5, -2.0F, -2.0F, 0.0F, 2, 1, 4, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.25F, -2.5F, 1.25F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 1.0F, -3.75F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.25F, -2.5F, 1.25F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 5, 0.0F, -2.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -3.75F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 22, -1.5F, 0.0F, 2.0F, 3, 1, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 26, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.5F, 0.025F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 14, -1.0F, 0.0F, -3.75F, 2, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 2.0F, -3.75F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.4189F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 0, -2.0F, -2.0F, 0.0F, 2, 1, 4, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 2.0F, -3.75F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.4189F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 0, 0.0F, -2.0F, 0.0F, 2, 1, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -3.75F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1134F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 23, -1.5F, -1.0F, 2.0F, 3, 1, 2, -0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 15, -1.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleX = (float)Math.toRadians(90);
        this.base.offsetY = -0.25F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.1F, 0.0F, 0.2F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(upperarmleft, 0.0F, -1.0F, 1.0F);
        this.setRotateAngle(lowerarmleft, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(upperarmleft2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmright, 0.0F, 1.0F, -1.0F);
        this.setRotateAngle(lowerarmright, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(upperarmright2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegleft, 0.0F, -1.0F, 1.0F);
        this.setRotateAngle(lowerlegleft, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(footleft, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegright, 0.0F, 1.0F, -1.0F);
        this.setRotateAngle(lowerlegright, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(footright, 0.0F, 0.0F, 0.0F);
        this.base.offsetY = -0.14F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.5F;
        this.base.offsetX = 0.4F;
        this.base.rotateAngleY = (float)Math.toRadians(220);
        this.base.rotateAngleX = (float)Math.toRadians(17);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 4.5F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.3F, 3.8F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(upperarmleft, 0.0F, -1.0F, 1.0F);
        this.setRotateAngle(lowerarmleft, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(upperarmleft2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmright, 0.0F, 1.0F, -1.0F);
        this.setRotateAngle(lowerarmright, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(upperarmright2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegleft, 0.0F, -1.0F, 1.0F);
        this.setRotateAngle(lowerlegleft, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(footleft, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegright, 0.0F, 1.0F, -1.0F);
        this.setRotateAngle(lowerlegright, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(footright, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        EntityPrehistoricFloraApateon entitySilesaurus = (EntityPrehistoricFloraApateon) e;

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
        EntityPrehistoricFloraApateon ee = (EntityPrehistoricFloraApateon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

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
        EntityPrehistoricFloraApateon entity = (EntityPrehistoricFloraApateon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 4.62389 + (((tickAnim - 0) / 6) * (-19.3427-(4.62389)));
            yy = -9.07786 + (((tickAnim - 0) / 6) * (-48.7097-(-9.07786)));
            zz = 3.48379 + (((tickAnim - 0) / 6) * (49.04842-(3.48379)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -19.3427 + (((tickAnim - 6) / 4) * (43.92015-(-19.3427)));
            yy = -48.7097 + (((tickAnim - 6) / 4) * (-73.97501-(-48.7097)));
            zz = 49.04842 + (((tickAnim - 6) / 4) * (-16.06413-(49.04842)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 43.92015 + (((tickAnim - 10) / 3) * (30.35055-(43.92015)));
            yy = -73.97501 + (((tickAnim - 10) / 3) * (-51.82869-(-73.97501)));
            zz = -16.06413 + (((tickAnim - 10) / 3) * (-6.14004-(-16.06413)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 30.35055 + (((tickAnim - 13) / 2) * (19.78492-(30.35055)));
            yy = -51.82869 + (((tickAnim - 13) / 2) * (-27.48208-(-51.82869)));
            zz = -6.14004 + (((tickAnim - 13) / 2) * (-1.61798-(-6.14004)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 19.78492 + (((tickAnim - 15) / 5) * (4.62389-(19.78492)));
            yy = -27.48208 + (((tickAnim - 15) / 5) * (-9.07786-(-27.48208)));
            zz = -1.61798 + (((tickAnim - 15) / 5) * (3.48379-(-1.61798)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -9.84623 + (((tickAnim - 0) / 6) * (0-(-9.84623)));
            yy = 7.90731 + (((tickAnim - 0) / 6) * (35-(7.90731)));
            zz = -8.20379 + (((tickAnim - 0) / 6) * (0-(-8.20379)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 35 + (((tickAnim - 6) / 4) * (0-(35)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (2.29891-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-1.93076-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (1.81836-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.29891 + (((tickAnim - 15) / 5) * (-9.84623-(2.29891)));
            yy = -1.93076 + (((tickAnim - 15) / 5) * (7.90731-(-1.93076)));
            zz = 1.81836 + (((tickAnim - 15) / 5) * (-8.20379-(1.81836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -22.5782 + (((tickAnim - 0) / 6) * (64.25144-(-22.5782)));
            yy = -58.38456 + (((tickAnim - 0) / 6) * (9.44456-(-58.38456)));
            zz = 43.02639 + (((tickAnim - 0) / 6) * (-12.40102-(43.02639)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 64.25144 + (((tickAnim - 6) / 4) * (-1.55041-(64.25144)));
            yy = 9.44456 + (((tickAnim - 6) / 4) * (15.91533-(9.44456)));
            zz = -12.40102 + (((tickAnim - 6) / 4) * (-7.3541-(-12.40102)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.55041 + (((tickAnim - 10) / 5) * (-7.85591-(-1.55041)));
            yy = 15.91533 + (((tickAnim - 10) / 5) * (-20.95532-(15.91533)));
            zz = -7.3541 + (((tickAnim - 10) / 5) * (10.12173-(-7.3541)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.85591 + (((tickAnim - 15) / 5) * (-22.5782-(-7.85591)));
            yy = -20.95532 + (((tickAnim - 15) / 5) * (-58.38456-(-20.95532)));
            zz = 10.12173 + (((tickAnim - 15) / 5) * (43.02639-(10.12173)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-190))*15), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-190))*10));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-250))*20));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+160))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+220))*15), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-7.42038-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (17.44798-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (1.72015-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -7.42038 + (((tickAnim - 1) / 1) * (-9.33706-(-7.42038)));
            yy = 17.44798 + (((tickAnim - 1) / 1) * (34.42247-(17.44798)));
            zz = 1.72015 + (((tickAnim - 1) / 1) * (-0.31363-(1.72015)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -9.33706 + (((tickAnim - 2) / 1) * (-6.25374-(-9.33706)));
            yy = 34.42247 + (((tickAnim - 2) / 1) * (51.39697-(34.42247)));
            zz = -0.31363 + (((tickAnim - 2) / 1) * (-2.34741-(-0.31363)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -6.25374 + (((tickAnim - 3) / 0) * (-8.33832-(-6.25374)));
            yy = 51.39697 + (((tickAnim - 3) / 0) * (68.52929-(51.39697)));
            zz = -2.34741 + (((tickAnim - 3) / 0) * (-3.12989-(-2.34741)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.33832 + (((tickAnim - 3) / 1) * (-5.42289-(-8.33832)));
            yy = 68.52929 + (((tickAnim - 3) / 1) * (85.66161-(68.52929)));
            zz = -3.12989 + (((tickAnim - 3) / 1) * (-3.91236-(-3.12989)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.42289 + (((tickAnim - 4) / 1) * (2.49253-(-5.42289)));
            yy = 85.66161 + (((tickAnim - 4) / 1) * (102.79394-(85.66161)));
            zz = -3.91236 + (((tickAnim - 4) / 1) * (-4.69483-(-3.91236)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.49253 + (((tickAnim - 5) / 1) * (8.91391-(2.49253)));
            yy = 102.79394 + (((tickAnim - 5) / 1) * (100.01182-(102.79394)));
            zz = -4.69483 + (((tickAnim - 5) / 1) * (10.65687-(-4.69483)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.91391 + (((tickAnim - 6) / 2) * (29.25667-(8.91391)));
            yy = 100.01182 + (((tickAnim - 6) / 2) * (94.4476-(100.01182)));
            zz = 10.65687 + (((tickAnim - 6) / 2) * (41.36028-(10.65687)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 29.25667 + (((tickAnim - 8) / 0) * (32.15882-(29.25667)));
            yy = 94.4476 + (((tickAnim - 8) / 0) * (88.51605-(94.4476)));
            zz = 41.36028 + (((tickAnim - 8) / 0) * (47.6814-(41.36028)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.15882 + (((tickAnim - 8) / 2) * (52.96312-(32.15882)));
            yy = 88.51605 + (((tickAnim - 8) / 2) * (76.65296-(88.51605)));
            zz = 47.6814 + (((tickAnim - 8) / 2) * (60.32364-(47.6814)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 52.96312 + (((tickAnim - 10) / 5) * (34.50697-(52.96312)));
            yy = 76.65296 + (((tickAnim - 10) / 5) * (7.31211-(76.65296)));
            zz = 60.32364 + (((tickAnim - 10) / 5) * (53.73454-(60.32364)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 34.50697 + (((tickAnim - 15) / 3) * (9.8238-(34.50697)));
            yy = 7.31211 + (((tickAnim - 15) / 3) * (-0.47976-(7.31211)));
            zz = 53.73454 + (((tickAnim - 15) / 3) * (45.41626-(53.73454)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 9.8238 + (((tickAnim - 18) / 1) * (-1.7254-(9.8238)));
            yy = -0.47976 + (((tickAnim - 18) / 1) * (-0.15992-(-0.47976)));
            zz = 45.41626 + (((tickAnim - 18) / 1) * (15.13875-(45.41626)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -1.7254 + (((tickAnim - 19) / 1) * (0-(-1.7254)));
            yy = -0.15992 + (((tickAnim - 19) / 1) * (0-(-0.15992)));
            zz = 15.13875 + (((tickAnim - 19) / 1) * (0-(15.13875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (36.03654-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-19.88946-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-44.27436-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.03654 + (((tickAnim - 3) / 2) * (78.05121-(36.03654)));
            yy = -19.88946 + (((tickAnim - 3) / 2) * (-19.42276-(-19.88946)));
            zz = -44.27436 + (((tickAnim - 3) / 2) * (-99.60664-(-44.27436)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 78.05121 + (((tickAnim - 5) / 5) * (-30.4855-(78.05121)));
            yy = -19.42276 + (((tickAnim - 5) / 5) * (1.57558-(-19.42276)));
            zz = -99.60664 + (((tickAnim - 5) / 5) * (-19.00491-(-99.60664)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.4855 + (((tickAnim - 10) / 10) * (0-(-30.4855)));
            yy = 1.57558 + (((tickAnim - 10) / 10) * (0-(1.57558)));
            zz = -19.00491 + (((tickAnim - 10) / 10) * (0-(-19.00491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.17848-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-11.98727-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-7.56398-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 19.17848 + (((tickAnim - 3) / 0) * (29.86081-(19.17848)));
            yy = -11.98727 + (((tickAnim - 3) / 0) * (-18.00075-(-11.98727)));
            zz = -7.56398 + (((tickAnim - 3) / 0) * (-19.13945-(-7.56398)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 29.86081 + (((tickAnim - 3) / 1) * (34.11307-(29.86081)));
            yy = -18.00075 + (((tickAnim - 3) / 1) * (-21.05172-(-18.00075)));
            zz = -19.13945 + (((tickAnim - 3) / 1) * (-23.58098-(-19.13945)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 34.11307 + (((tickAnim - 4) / 1) * (52.69906-(34.11307)));
            yy = -21.05172 + (((tickAnim - 4) / 1) * (-26.93965-(-21.05172)));
            zz = -23.58098 + (((tickAnim - 4) / 1) * (-46.17309-(-23.58098)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 52.69906 + (((tickAnim - 5) / 3) * (69.77087-(52.69906)));
            yy = -26.93965 + (((tickAnim - 5) / 3) * (-32.8418-(-26.93965)));
            zz = -46.17309 + (((tickAnim - 5) / 3) * (-58.0636-(-46.17309)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 69.77087 + (((tickAnim - 8) / 2) * (85.33446-(69.77087)));
            yy = -32.8418 + (((tickAnim - 8) / 2) * (-30.74348-(-32.8418)));
            zz = -58.0636 + (((tickAnim - 8) / 2) * (-106.51025-(-58.0636)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 85.33446 + (((tickAnim - 10) / 5) * (25.03217-(85.33446)));
            yy = -30.74348 + (((tickAnim - 10) / 5) * (28.62434-(-30.74348)));
            zz = -106.51025 + (((tickAnim - 10) / 5) * (-80.07606-(-106.51025)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25.03217 + (((tickAnim - 15) / 5) * (0-(25.03217)));
            yy = 28.62434 + (((tickAnim - 15) / 5) * (0-(28.62434)));
            zz = -80.07606 + (((tickAnim - 15) / 5) * (0-(-80.07606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(xx), upperarmright2.rotateAngleY + (float) Math.toRadians(yy), upperarmright2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+370))*14), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 52.96312 + (((tickAnim - 0) / 5) * (34.50697-(52.96312)));
            yy = -76.65296 + (((tickAnim - 0) / 5) * (-7.31211-(-76.65296)));
            zz = -60.32364 + (((tickAnim - 0) / 5) * (-53.73454-(-60.32364)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 34.50697 + (((tickAnim - 5) / 3) * (9.8238-(34.50697)));
            yy = -7.31211 + (((tickAnim - 5) / 3) * (0.47976-(-7.31211)));
            zz = -53.73454 + (((tickAnim - 5) / 3) * (-45.41626-(-53.73454)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.8238 + (((tickAnim - 8) / 1) * (-1.7254-(9.8238)));
            yy = 0.47976 + (((tickAnim - 8) / 1) * (0.15992-(0.47976)));
            zz = -45.41626 + (((tickAnim - 8) / 1) * (-15.13875-(-45.41626)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -1.7254 + (((tickAnim - 9) / 1) * (0-(-1.7254)));
            yy = 0.15992 + (((tickAnim - 9) / 1) * (0-(0.15992)));
            zz = -15.13875 + (((tickAnim - 9) / 1) * (0-(-15.13875)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (-7.42038-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (-17.44798-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (-1.72015-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -7.42038 + (((tickAnim - 11) / 1) * (-9.33706-(-7.42038)));
            yy = -17.44798 + (((tickAnim - 11) / 1) * (-34.42247-(-17.44798)));
            zz = -1.72015 + (((tickAnim - 11) / 1) * (0.31363-(-1.72015)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -9.33706 + (((tickAnim - 12) / 1) * (-6.25374-(-9.33706)));
            yy = -34.42247 + (((tickAnim - 12) / 1) * (-51.39697-(-34.42247)));
            zz = 0.31363 + (((tickAnim - 12) / 1) * (2.34741-(0.31363)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -6.25374 + (((tickAnim - 13) / 0) * (-8.33832-(-6.25374)));
            yy = -51.39697 + (((tickAnim - 13) / 0) * (-68.52929-(-51.39697)));
            zz = 2.34741 + (((tickAnim - 13) / 0) * (3.12989-(2.34741)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -8.33832 + (((tickAnim - 13) / 1) * (-5.42289-(-8.33832)));
            yy = -68.52929 + (((tickAnim - 13) / 1) * (-85.66161-(-68.52929)));
            zz = 3.12989 + (((tickAnim - 13) / 1) * (3.91236-(3.12989)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -5.42289 + (((tickAnim - 14) / 1) * (2.49253-(-5.42289)));
            yy = -85.66161 + (((tickAnim - 14) / 1) * (-102.79394-(-85.66161)));
            zz = 3.91236 + (((tickAnim - 14) / 1) * (4.69483-(3.91236)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 2.49253 + (((tickAnim - 15) / 1) * (8.91391-(2.49253)));
            yy = -102.79394 + (((tickAnim - 15) / 1) * (-100.01182-(-102.79394)));
            zz = 4.69483 + (((tickAnim - 15) / 1) * (-10.65687-(4.69483)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 8.91391 + (((tickAnim - 16) / 2) * (29.25667-(8.91391)));
            yy = -100.01182 + (((tickAnim - 16) / 2) * (-94.4476-(-100.01182)));
            zz = -10.65687 + (((tickAnim - 16) / 2) * (-41.36028-(-10.65687)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 29.25667 + (((tickAnim - 18) / 0) * (32.15882-(29.25667)));
            yy = -94.4476 + (((tickAnim - 18) / 0) * (-88.51605-(-94.4476)));
            zz = -41.36028 + (((tickAnim - 18) / 0) * (-47.6814-(-41.36028)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 32.15882 + (((tickAnim - 18) / 2) * (52.96312-(32.15882)));
            yy = -88.51605 + (((tickAnim - 18) / 2) * (-76.65296-(-88.51605)));
            zz = -47.6814 + (((tickAnim - 18) / 2) * (-60.32364-(-47.6814)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -30.4855 + (((tickAnim - 0) / 10) * (0-(-30.4855)));
            yy = -1.57558 + (((tickAnim - 0) / 10) * (0-(-1.57558)));
            zz = 19.00491 + (((tickAnim - 0) / 10) * (0-(19.00491)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (36.03654-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (19.88946-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (44.27436-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 36.03654 + (((tickAnim - 13) / 2) * (78.05121-(36.03654)));
            yy = 19.88946 + (((tickAnim - 13) / 2) * (19.42276-(19.88946)));
            zz = 44.27436 + (((tickAnim - 13) / 2) * (99.60664-(44.27436)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 78.05121 + (((tickAnim - 15) / 5) * (-30.4855-(78.05121)));
            yy = 19.42276 + (((tickAnim - 15) / 5) * (-1.57558-(19.42276)));
            zz = 99.60664 + (((tickAnim - 15) / 5) * (19.00491-(99.60664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 85.33446 + (((tickAnim - 0) / 5) * (25.03217-(85.33446)));
            yy = 30.74348 + (((tickAnim - 0) / 5) * (-28.62434-(30.74348)));
            zz = 106.51025 + (((tickAnim - 0) / 5) * (80.07606-(106.51025)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.03217 + (((tickAnim - 5) / 5) * (0-(25.03217)));
            yy = -28.62434 + (((tickAnim - 5) / 5) * (0-(-28.62434)));
            zz = 80.07606 + (((tickAnim - 5) / 5) * (0-(80.07606)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (19.402-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (10.96826-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (8.6872-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 19.402 + (((tickAnim - 13) / 0) * (29.86081-(19.402)));
            yy = 10.96826 + (((tickAnim - 13) / 0) * (18.00075-(10.96826)));
            zz = 8.6872 + (((tickAnim - 13) / 0) * (19.13945-(8.6872)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 29.86081 + (((tickAnim - 13) / 1) * (40.50867-(29.86081)));
            yy = 18.00075 + (((tickAnim - 13) / 1) * (24.41549-(18.00075)));
            zz = 19.13945 + (((tickAnim - 13) / 1) * (30.73468-(19.13945)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 40.50867 + (((tickAnim - 14) / 1) * (52.26526-(40.50867)));
            yy = 24.41549 + (((tickAnim - 14) / 1) * (25.42411-(24.41549)));
            zz = 30.73468 + (((tickAnim - 14) / 1) * (45.15912-(30.73468)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 52.26526 + (((tickAnim - 15) / 3) * (69.77087-(52.26526)));
            yy = 25.42411 + (((tickAnim - 15) / 3) * (32.84183-(25.42411)));
            zz = 45.15912 + (((tickAnim - 15) / 3) * (58.06358-(45.15912)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 69.77087 + (((tickAnim - 18) / 2) * (85.33446-(69.77087)));
            yy = 32.84183 + (((tickAnim - 18) / 2) * (30.74348-(32.84183)));
            zz = 58.06358 + (((tickAnim - 18) / 2) * (106.51025-(58.06358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(xx), upperarmleft2.rotateAngleY + (float) Math.toRadians(yy), upperarmleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.92015 + (((tickAnim - 0) / 3) * (30.35055-(43.92015)));
            yy = 73.97501 + (((tickAnim - 0) / 3) * (51.82869-(73.97501)));
            zz = 16.06413 + (((tickAnim - 0) / 3) * (6.14004-(16.06413)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.35055 + (((tickAnim - 3) / 2) * (19.78492-(30.35055)));
            yy = 51.82869 + (((tickAnim - 3) / 2) * (27.48208-(51.82869)));
            zz = 6.14004 + (((tickAnim - 3) / 2) * (1.61798-(6.14004)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.78492 + (((tickAnim - 5) / 5) * (4.62389-(19.78492)));
            yy = 27.48208 + (((tickAnim - 5) / 5) * (9.07786-(27.48208)));
            zz = 1.61798 + (((tickAnim - 5) / 5) * (-3.48379-(1.61798)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 4.62389 + (((tickAnim - 10) / 6) * (-19.3427-(4.62389)));
            yy = 9.07786 + (((tickAnim - 10) / 6) * (48.7097-(9.07786)));
            zz = -3.48379 + (((tickAnim - 10) / 6) * (-49.04842-(-3.48379)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -19.3427 + (((tickAnim - 16) / 4) * (43.92015-(-19.3427)));
            yy = 48.7097 + (((tickAnim - 16) / 4) * (73.97501-(48.7097)));
            zz = -49.04842 + (((tickAnim - 16) / 4) * (16.06413-(-49.04842)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.29891-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.93076-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.81836-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.29891 + (((tickAnim - 5) / 5) * (-9.84623-(2.29891)));
            yy = 1.93076 + (((tickAnim - 5) / 5) * (-7.90731-(1.93076)));
            zz = -1.81836 + (((tickAnim - 5) / 5) * (8.20379-(-1.81836)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -9.84623 + (((tickAnim - 10) / 6) * (0-(-9.84623)));
            yy = -7.90731 + (((tickAnim - 10) / 6) * (-35-(-7.90731)));
            zz = 8.20379 + (((tickAnim - 10) / 6) * (0-(8.20379)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -35 + (((tickAnim - 16) / 4) * (0-(-35)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.55041 + (((tickAnim - 0) / 5) * (-7.85591-(-1.55041)));
            yy = -15.91533 + (((tickAnim - 0) / 5) * (20.95532-(-15.91533)));
            zz = 7.3541 + (((tickAnim - 0) / 5) * (-10.12173-(7.3541)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.85591 + (((tickAnim - 5) / 5) * (-22.5782-(-7.85591)));
            yy = 20.95532 + (((tickAnim - 5) / 5) * (58.38456-(20.95532)));
            zz = -10.12173 + (((tickAnim - 5) / 5) * (-43.02639-(-10.12173)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -22.5782 + (((tickAnim - 10) / 6) * (64.25144-(-22.5782)));
            yy = 58.38456 + (((tickAnim - 10) / 6) * (-9.44456-(58.38456)));
            zz = -43.02639 + (((tickAnim - 10) / 6) * (12.40102-(-43.02639)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 64.25144 + (((tickAnim - 16) / 4) * (-1.55041-(64.25144)));
            yy = -9.44456 + (((tickAnim - 16) / 4) * (-15.91533-(-9.44456)));
            zz = 12.40102 + (((tickAnim - 16) / 4) * (7.3541-(12.40102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*10), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-180))*2);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraApateon entity = (EntityPrehistoricFloraApateon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(20), upperlegright.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegright.rotateAngleZ + (float) Math.toRadians(-20));
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(0), lowerlegright.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-50))*10), lowerlegright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footright.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*2.5));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60+30))*5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100+60))*15));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+205))*5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-230))*10), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(90), upperarmright.rotateAngleY + (float) Math.toRadians(80.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmright.rotateAngleZ + (float) Math.toRadians(30));
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(0), lowerarmleft.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(4.9935), upperarmright2.rotateAngleY + (float) Math.toRadians(22.359-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmright2.rotateAngleZ + (float) Math.toRadians(-43.59069));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+190))*10), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(90), upperarmleft.rotateAngleY + (float) Math.toRadians(-77.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmleft.rotateAngleZ + (float) Math.toRadians(-30));
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(0), lowerarmright.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(-11.70836), upperarmleft2.rotateAngleY + (float) Math.toRadians(-9.2544-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmleft2.rotateAngleZ + (float) Math.toRadians(30.58511));
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(20), upperlegleft.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegleft.rotateAngleZ + (float) Math.toRadians(20));
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(0), lowerlegleft.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), lowerlegleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footleft.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*20), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*5));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-220))*1.5);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);
        this.setRotateAngle(gillright, gillright.rotateAngleX + (float) Math.toRadians(0), gillright.rotateAngleY + (float) Math.toRadians(0), gillright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4));
        this.setRotateAngle(gillleft, gillleft.rotateAngleX + (float) Math.toRadians(0), gillleft.rotateAngleY + (float) Math.toRadians(0), gillleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4));
        this.setRotateAngle(gillright2, gillright2.rotateAngleX + (float) Math.toRadians(0), gillright2.rotateAngleY + (float) Math.toRadians(0), gillright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4));
        this.setRotateAngle(gillleft2, gillleft2.rotateAngleX + (float) Math.toRadians(0), gillleft2.rotateAngleY + (float) Math.toRadians(0), gillleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4));
        this.setRotateAngle(gillright3, gillright3.rotateAngleX + (float) Math.toRadians(0), gillright3.rotateAngleY + (float) Math.toRadians(0), gillright3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4));
        this.setRotateAngle(gillleft3, gillleft3.rotateAngleX + (float) Math.toRadians(0), gillleft3.rotateAngleY + (float) Math.toRadians(0), gillleft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApateon entity = (EntityPrehistoricFloraApateon) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.25 + (((tickAnim - 4) / 4) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 28 + (((tickAnim - 4) / 3) * (0-(28)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraApateon e = (EntityPrehistoricFloraApateon) entity;
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
