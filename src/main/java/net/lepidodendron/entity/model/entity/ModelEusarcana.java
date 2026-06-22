package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEusarcana;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelEusarcana extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Eusarcana;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftPedipalp;
    private final AdvancedModelRenderer rightPedipalp;
    private final AdvancedModelRenderer leftLegFirst1;
    private final AdvancedModelRenderer leftLegFirst2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLegFirst1;
    private final AdvancedModelRenderer rightLegFirst2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLegSecond1;
    private final AdvancedModelRenderer leftLegSecond2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLegSecond1;
    private final AdvancedModelRenderer rightLegSecond2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLegThird;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLegThird;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftPaddle1;
    private final AdvancedModelRenderer leftPaddle2;
    private final AdvancedModelRenderer leftPaddle3;
    private final AdvancedModelRenderer rightPaddle1;
    private final AdvancedModelRenderer rightPaddle2;
    private final AdvancedModelRenderer rightPaddle3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer cube_r11;

    private ModelAnimator animator;

    public ModelEusarcana() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.Eusarcana = new AdvancedModelRenderer(this);
        this.Eusarcana.setRotationPoint(0.0F, 23.0F, -4.0F);
        this.Eusarcana.cubeList.add(new ModelBox(Eusarcana, 27, 15, -3.0F, -1.0F, -1.0F, 6, 2, 1, 0.01F, false));
        this.Eusarcana.cubeList.add(new ModelBox(Eusarcana, 13, 23, -1.0F, -1.0F, -4.75F, 2, 2, 4, 0.0F, false));
        this.Eusarcana.cubeList.add(new ModelBox(Eusarcana, 6, 33, -0.5F, -1.05F, -2.5F, 1, 0, 1, 0.0F, false));
        this.Eusarcana.cubeList.add(new ModelBox(Eusarcana, 21, 32, -1.0F, 0.25F, -4.45F, 2, 1, 2, -0.01F, false));
        this.Eusarcana.cubeList.add(new ModelBox(Eusarcana, 0, 27, -2.0F, 0.25F, -2.5F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, 0.9F, -1.3F);
        this.Eusarcana.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, 0.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, 1.0F, -1.0F);
        this.Eusarcana.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 1, 0.0F, -2.0F, -4.0F, 2, 2, 4, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, 0.9F, -1.3F);
        this.Eusarcana.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -1.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, 1.0F, -1.0F);
        this.Eusarcana.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 1, -2.0F, -2.0F, -4.0F, 2, 2, 4, -0.01F, false));

        this.leftPedipalp = new AdvancedModelRenderer(this);
        this.leftPedipalp.setRotationPoint(0.5F, 0.75F, -4.25F);
        this.Eusarcana.addChild(leftPedipalp);
        this.setRotateAngle(leftPedipalp, 0.0F, 1.0036F, 0.0F);
        this.leftPedipalp.cubeList.add(new ModelBox(leftPedipalp, 9, 36, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.leftPedipalp.cubeList.add(new ModelBox(leftPedipalp, 14, 11, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));
        this.leftPedipalp.cubeList.add(new ModelBox(leftPedipalp, 14, 9, 1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.rightPedipalp = new AdvancedModelRenderer(this);
        this.rightPedipalp.setRotationPoint(-0.5F, 0.75F, -4.25F);
        this.Eusarcana.addChild(rightPedipalp);
        this.setRotateAngle(rightPedipalp, 0.0F, -1.0036F, 0.0F);
        this.rightPedipalp.cubeList.add(new ModelBox(rightPedipalp, 9, 36, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.rightPedipalp.cubeList.add(new ModelBox(rightPedipalp, 14, 11, -3.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));
        this.rightPedipalp.cubeList.add(new ModelBox(rightPedipalp, 14, 9, -2.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftLegFirst1 = new AdvancedModelRenderer(this);
        this.leftLegFirst1.setRotationPoint(0.5F, 0.75F, -3.5F);
        this.Eusarcana.addChild(leftLegFirst1);
        this.setRotateAngle(leftLegFirst1, 0.0F, 0.5672F, 0.1745F);
        this.leftLegFirst1.cubeList.add(new ModelBox(leftLegFirst1, 30, 32, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.01F, false));
        this.leftLegFirst1.cubeList.add(new ModelBox(leftLegFirst1, 0, 12, 1.75F, 0.0F, -1.5F, 1, 0, 1, 0.0F, false));

        this.leftLegFirst2 = new AdvancedModelRenderer(this);
        this.leftLegFirst2.setRotationPoint(3.0F, 0.0F, 0.5F);
        this.leftLegFirst1.addChild(leftLegFirst2);
        this.setRotateAngle(leftLegFirst2, 0.0F, 0.3491F, 0.0F);
        this.leftLegFirst2.cubeList.add(new ModelBox(leftLegFirst2, 22, 23, 0.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));
        this.leftLegFirst2.cubeList.add(new ModelBox(leftLegFirst2, 18, 30, 0.75F, 0.0F, -2.0F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.leftLegFirst2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.48F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.rightLegFirst1 = new AdvancedModelRenderer(this);
        this.rightLegFirst1.setRotationPoint(-0.5F, 0.75F, -3.5F);
        this.Eusarcana.addChild(rightLegFirst1);
        this.setRotateAngle(rightLegFirst1, 0.0F, -0.5672F, -0.1745F);
        this.rightLegFirst1.cubeList.add(new ModelBox(rightLegFirst1, 30, 32, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.01F, true));
        this.rightLegFirst1.cubeList.add(new ModelBox(rightLegFirst1, 0, 12, -2.75F, 0.0F, -1.5F, 1, 0, 1, 0.0F, true));

        this.rightLegFirst2 = new AdvancedModelRenderer(this);
        this.rightLegFirst2.setRotationPoint(-3.0F, 0.0F, 0.5F);
        this.rightLegFirst1.addChild(rightLegFirst2);
        this.setRotateAngle(rightLegFirst2, 0.0F, -0.3491F, 0.0F);
        this.rightLegFirst2.cubeList.add(new ModelBox(rightLegFirst2, 22, 23, -2.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, true));
        this.rightLegFirst2.cubeList.add(new ModelBox(rightLegFirst2, 18, 30, -1.75F, 0.0F, -2.0F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.rightLegFirst2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.leftLegSecond1 = new AdvancedModelRenderer(this);
        this.leftLegSecond1.setRotationPoint(1.0F, 0.75F, -2.75F);
        this.Eusarcana.addChild(leftLegSecond1);
        this.setRotateAngle(leftLegSecond1, 0.0F, 0.2182F, 0.3491F);
        this.leftLegSecond1.cubeList.add(new ModelBox(leftLegSecond1, 30, 32, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.01F, false));
        this.leftLegSecond1.cubeList.add(new ModelBox(leftLegSecond1, 0, 12, 1.75F, 0.0F, -1.5F, 1, 0, 1, 0.0F, false));

        this.leftLegSecond2 = new AdvancedModelRenderer(this);
        this.leftLegSecond2.setRotationPoint(3.0F, 0.0F, 0.5F);
        this.leftLegSecond1.addChild(leftLegSecond2);
        this.setRotateAngle(leftLegSecond2, 0.0F, 0.3491F, 0.0F);
        this.leftLegSecond2.cubeList.add(new ModelBox(leftLegSecond2, 22, 23, 0.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));
        this.leftLegSecond2.cubeList.add(new ModelBox(leftLegSecond2, 18, 30, 0.75F, 0.0F, -2.0F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.leftLegSecond2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.rightLegSecond1 = new AdvancedModelRenderer(this);
        this.rightLegSecond1.setRotationPoint(-1.0F, 0.75F, -2.75F);
        this.Eusarcana.addChild(rightLegSecond1);
        this.setRotateAngle(rightLegSecond1, 0.0F, -0.2182F, -0.3491F);
        this.rightLegSecond1.cubeList.add(new ModelBox(rightLegSecond1, 30, 32, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.01F, true));
        this.rightLegSecond1.cubeList.add(new ModelBox(rightLegSecond1, 0, 12, -2.75F, 0.0F, -1.5F, 1, 0, 1, 0.0F, true));

        this.rightLegSecond2 = new AdvancedModelRenderer(this);
        this.rightLegSecond2.setRotationPoint(-3.0F, 0.0F, 0.5F);
        this.rightLegSecond1.addChild(rightLegSecond2);
        this.setRotateAngle(rightLegSecond2, 0.0F, -0.3491F, 0.0F);
        this.rightLegSecond2.cubeList.add(new ModelBox(rightLegSecond2, 22, 23, -2.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, true));
        this.rightLegSecond2.cubeList.add(new ModelBox(rightLegSecond2, 18, 30, -1.75F, 0.0F, -2.0F, 1, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.rightLegSecond2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.48F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.leftLegThird = new AdvancedModelRenderer(this);
        this.leftLegThird.setRotationPoint(1.25F, 0.75F, -2.0F);
        this.Eusarcana.addChild(leftLegThird);
        this.setRotateAngle(leftLegThird, 0.0F, 0.0873F, 0.6981F);
        this.leftLegThird.cubeList.add(new ModelBox(leftLegThird, 0, 17, 0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));
        this.leftLegThird.cubeList.add(new ModelBox(leftLegThird, 16, 36, 2.75F, 0.0F, -1.5F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.0F, 0.0F, 0.5F);
        this.leftLegThird.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 31, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.rightLegThird = new AdvancedModelRenderer(this);
        this.rightLegThird.setRotationPoint(-1.25F, 0.75F, -2.0F);
        this.Eusarcana.addChild(rightLegThird);
        this.setRotateAngle(rightLegThird, 0.0F, -0.0873F, -0.6981F);
        this.rightLegThird.cubeList.add(new ModelBox(rightLegThird, 0, 17, -4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));
        this.rightLegThird.cubeList.add(new ModelBox(rightLegThird, 16, 36, -3.75F, 0.0F, -1.5F, 1, 0, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.0F, 0.0F, 0.5F);
        this.rightLegThird.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.48F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 31, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftPaddle1 = new AdvancedModelRenderer(this);
        this.leftPaddle1.setRotationPoint(1.5F, 0.75F, -1.5F);
        this.Eusarcana.addChild(leftPaddle1);
        this.setRotateAngle(leftPaddle1, 0.0F, -0.2618F, 0.3491F);
        this.leftPaddle1.cubeList.add(new ModelBox(leftPaddle1, 29, 35, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.leftPaddle1.cubeList.add(new ModelBox(leftPaddle1, 0, 35, 0.0F, -0.5F, 0.0F, 3, 1, 1, -0.01F, false));

        this.leftPaddle2 = new AdvancedModelRenderer(this);
        this.leftPaddle2.setRotationPoint(3.0F, 0.5F, 0.0F);
        this.leftPaddle1.addChild(leftPaddle2);
        this.setRotateAngle(leftPaddle2, 0.0F, -0.3491F, 0.0F);
        this.leftPaddle2.cubeList.add(new ModelBox(leftPaddle2, 32, 19, 0.0F, -1.0F, -0.5F, 3, 1, 2, 0.01F, false));

        this.leftPaddle3 = new AdvancedModelRenderer(this);
        this.leftPaddle3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftPaddle2.addChild(leftPaddle3);
        this.setRotateAngle(leftPaddle3, 0.0F, -0.4363F, 0.0F);
        this.leftPaddle3.cubeList.add(new ModelBox(leftPaddle3, 32, 0, 0.0F, -1.0F, -0.5F, 3, 1, 2, 0.0F, false));

        this.rightPaddle1 = new AdvancedModelRenderer(this);
        this.rightPaddle1.setRotationPoint(-1.5F, 0.75F, -1.5F);
        this.Eusarcana.addChild(rightPaddle1);
        this.setRotateAngle(rightPaddle1, 0.0F, 0.2618F, -0.3491F);
        this.rightPaddle1.cubeList.add(new ModelBox(rightPaddle1, 29, 35, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.rightPaddle1.cubeList.add(new ModelBox(rightPaddle1, 0, 35, -3.0F, -0.5F, 0.0F, 3, 1, 1, -0.01F, true));

        this.rightPaddle2 = new AdvancedModelRenderer(this);
        this.rightPaddle2.setRotationPoint(-3.0F, 0.5F, 0.0F);
        this.rightPaddle1.addChild(rightPaddle2);
        this.setRotateAngle(rightPaddle2, 0.0F, 0.3491F, 0.0F);
        this.rightPaddle2.cubeList.add(new ModelBox(rightPaddle2, 32, 19, -3.0F, -1.0F, -0.5F, 3, 1, 2, 0.01F, true));

        this.rightPaddle3 = new AdvancedModelRenderer(this);
        this.rightPaddle3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightPaddle2.addChild(rightPaddle3);
        this.setRotateAngle(rightPaddle3, 0.0F, 0.4363F, 0.0F);
        this.rightPaddle3.cubeList.add(new ModelBox(rightPaddle3, 32, 0, -3.0F, -1.0F, -0.5F, 3, 1, 2, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eusarcana.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 9, -2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 31, -0.5F, 1.05F, 0.0F, 1, 0, 3, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 20, 9, -4.5F, -0.25F, 1.0F, 9, 1, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -5.0F, -0.25F, 2.0F, 10, 1, 3, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 20, 12, -4.0F, -0.25F, 0.0F, 8, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 13, 20, -4.0F, -0.25F, 2.0F, 8, 1, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 20, -2.0F, -1.0F, 0.0F, 4, 2, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 5, -4.5F, -0.25F, 0.0F, 9, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 25, 29, -3.0F, -0.25F, 3.0F, 6, 1, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 26, 23, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 23, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 10, 30, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 30, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.01F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail4.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 36, 4, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.telson.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 10, 0.0F, -1.0F, -0.25F, 0, 2, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Eusarcana.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Eusarcana.rotateAngleY = (float) Math.toRadians(360);
        this.setRotateAngle(Eusarcana, 1.5F, 0.0F, -0.25F);
        this.Eusarcana.offsetY = -0.2F;
        this.Eusarcana.offsetX = 0.02F;
        this.Eusarcana.offsetZ = -0.29F;
        this.Eusarcana.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Eusarcana.offsetY = -1.0F;
        this.Eusarcana.offsetX = 0.0F;
        this.Eusarcana.offsetZ = 2.0F;
        this.Eusarcana.rotateAngleY = (float)Math.toRadians(120);
        this.Eusarcana.rotateAngleX = (float)Math.toRadians(1);
        this.Eusarcana.rotateAngleZ = (float)Math.toRadians(0);
        this.Eusarcana.scaleChildren = true;
        float scaler = 1.F;
        this.Eusarcana.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Eusarcana, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Eusarcana.render(f);
        //Reset rotations, positions and sizing:
        this.Eusarcana.setScale(1.0F, 1.0F, 1.0F);
        this.Eusarcana.scaleChildren = false;
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
       // this.body.offsetY = 0.4F;
        this.Eusarcana.offsetY = -0.25F;
        this.Eusarcana.offsetZ = 0.1F;

        AdvancedModelRenderer[] fishBody = {this.body1, this.body2, this.tail1, this.tail2, this.tail3, this.tail4, this.telson};
        AdvancedModelRenderer[] fishTail = {this.tail4, this.telson};

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraEusarcana ciurc = (EntityPrehistoricFloraEusarcana) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if ((!ciurc.getIsMoving()) && ciurc.isReallyInWater()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                this.bob(Eusarcana, -speed * 5.0F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed * 3.0F, 0.05F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEusarcana ee = (EntityPrehistoricFloraEusarcana) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
                    //Walk pose:
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    if ((ee.getAnimation() != ee.SWIM_ANIMATION)) {
                        if (ee.getIsFast()) {
                            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        }
                    }
                }
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    if (ee.isReallySwimming()) {
                        //Swim static pose:
                        animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    } else {
                        //Walk static pose:
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                }
            }
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraEusarcana entity = (EntityPrehistoricFloraEusarcana) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Eusarcana, Eusarcana.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4))*4), Eusarcana.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2))*4), Eusarcana.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*5))*4));
        this.Eusarcana.rotationPointX = this.Eusarcana.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*3+60))*0.2);
        this.Eusarcana.rotationPointY = this.Eusarcana.rotationPointY - (float)(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*6+60))*0.3);
        this.Eusarcana.rotationPointZ = this.Eusarcana.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*6+60))*0.1);


        this.setRotateAngle(leftPedipalp, leftPedipalp.rotateAngleX + (float) Math.toRadians(0), leftPedipalp.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*8-60))*10), leftPedipalp.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*7-60*2))*10));


        this.setRotateAngle(rightPedipalp, rightPedipalp.rotateAngleX + (float) Math.toRadians(0), rightPedipalp.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*8))*10), rightPedipalp.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*7-60))*10));



         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 75.94273 + (((tickAnim - 0) / 4) * (52.01465-(75.94273)));
        yy = -9.81037 + (((tickAnim - 0) / 4) * (9.08804-(-9.81037)));
        zz = -23.00066 + (((tickAnim - 0) / 4) * (-23.33955-(-23.00066)));
    }
            else if (tickAnim >= 4 && tickAnim < 8) {
    xx = 52.01465 + (((tickAnim - 4) / 4) * (52.72512-(52.01465)));
    yy = 9.08804 + (((tickAnim - 4) / 4) * (23.00902-(9.08804)));
    zz = -23.33955 + (((tickAnim - 4) / 4) * (-21.73068-(-23.33955)));
}
        else if (tickAnim >= 8 && tickAnim < 17) {
        xx = 52.72512 + (((tickAnim - 8) / 9) * (75.94273-(52.72512)));
        yy = 23.00902 + (((tickAnim - 8) / 9) * (-9.81037-(23.00902)));
        zz = -21.73068 + (((tickAnim - 8) / 9) * (-23.00066-(-21.73068)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
        xx = 75.94273 + (((tickAnim - 17) / 4) * (52.01465-(75.94273)));
        yy = -9.81037 + (((tickAnim - 17) / 4) * (9.08804-(-9.81037)));
        zz = -23.00066 + (((tickAnim - 17) / 4) * (-23.33955-(-23.00066)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
        xx = 52.01465 + (((tickAnim - 21) / 4) * (52.72512-(52.01465)));
        yy = 9.08804 + (((tickAnim - 21) / 4) * (23.00902-(9.08804)));
        zz = -23.33955 + (((tickAnim - 21) / 4) * (-21.73068-(-23.33955)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
        xx = 52.72512 + (((tickAnim - 25) / 8) * (75.94273-(52.72512)));
        yy = 23.00902 + (((tickAnim - 25) / 8) * (-9.81037-(23.00902)));
        zz = -21.73068 + (((tickAnim - 25) / 8) * (-23.00066-(-21.73068)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
        xx = 75.94273 + (((tickAnim - 33) / 5) * (52.01465-(75.94273)));
        yy = -9.81037 + (((tickAnim - 33) / 5) * (9.08804-(-9.81037)));
        zz = -23.00066 + (((tickAnim - 33) / 5) * (-23.33955-(-23.00066)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
        xx = 52.01465 + (((tickAnim - 38) / 4) * (52.72512-(52.01465)));
        yy = 9.08804 + (((tickAnim - 38) / 4) * (23.00902-(9.08804)));
        zz = -23.33955 + (((tickAnim - 38) / 4) * (-21.73068-(-23.33955)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
        xx = 52.72512 + (((tickAnim - 42) / 8) * (75.94273-(52.72512)));
        yy = 23.00902 + (((tickAnim - 42) / 8) * (-9.81037-(23.00902)));
        zz = -21.73068 + (((tickAnim - 42) / 8) * (-23.00066-(-21.73068)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
        xx = 75.94273 + (((tickAnim - 50) / 4) * (52.01465-(75.94273)));
        yy = -9.81037 + (((tickAnim - 50) / 4) * (9.08804-(-9.81037)));
        zz = -23.00066 + (((tickAnim - 50) / 4) * (-23.33955-(-23.00066)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
        xx = 52.01465 + (((tickAnim - 54) / 4) * (52.72512-(52.01465)));
        yy = 9.08804 + (((tickAnim - 54) / 4) * (23.00902-(9.08804)));
        zz = -23.33955 + (((tickAnim - 54) / 4) * (-21.73068-(-23.33955)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
        xx = 52.72512 + (((tickAnim - 58) / 9) * (75.94273-(52.72512)));
        yy = 23.00902 + (((tickAnim - 58) / 9) * (-9.81037-(23.00902)));
        zz = -21.73068 + (((tickAnim - 58) / 9) * (-23.00066-(-21.73068)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
        xx = 75.94273 + (((tickAnim - 67) / 4) * (52.01465-(75.94273)));
        yy = -9.81037 + (((tickAnim - 67) / 4) * (9.08804-(-9.81037)));
        zz = -23.00066 + (((tickAnim - 67) / 4) * (-23.33955-(-23.00066)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
        xx = 52.01465 + (((tickAnim - 71) / 4) * (52.72512-(52.01465)));
        yy = 9.08804 + (((tickAnim - 71) / 4) * (23.00902-(9.08804)));
        zz = -23.33955 + (((tickAnim - 71) / 4) * (-21.73068-(-23.33955)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
        xx = 52.72512 + (((tickAnim - 75) / 8) * (75.94273-(52.72512)));
        yy = 23.00902 + (((tickAnim - 75) / 8) * (-9.81037-(23.00902)));
        zz = -21.73068 + (((tickAnim - 75) / 8) * (-23.00066-(-21.73068)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
        xx = 75.94273 + (((tickAnim - 83) / 5) * (52.01465-(75.94273)));
        yy = -9.81037 + (((tickAnim - 83) / 5) * (9.08804-(-9.81037)));
        zz = -23.00066 + (((tickAnim - 83) / 5) * (-23.33955-(-23.00066)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
        xx = 52.01465 + (((tickAnim - 88) / 4) * (52.72512-(52.01465)));
        yy = 9.08804 + (((tickAnim - 88) / 4) * (23.00902-(9.08804)));
        zz = -23.33955 + (((tickAnim - 88) / 4) * (-21.73068-(-23.33955)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
        xx = 52.72512 + (((tickAnim - 92) / 6) * (72.07-(52.72512)));
        yy = 23.00902 + (((tickAnim - 92) / 6) * (-4.34-(23.00902)));
        zz = -21.73068 + (((tickAnim - 92) / 6) * (-22.79-(-21.73068)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
        xx = 72.07 + (((tickAnim - 98) / 2) * (75.94273-(72.07)));
        yy = -4.34 + (((tickAnim - 98) / 2) * (-9.81037-(-4.34)));
        zz = -22.79 + (((tickAnim - 98) / 2) * (-23.00066-(-22.79)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegFirst1, leftLegFirst1.rotateAngleX + (float) Math.toRadians(xx), leftLegFirst1.rotateAngleY + (float) Math.toRadians(yy), leftLegFirst1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        yy = 67.5 + (((tickAnim - 0) / 4) * (-15-(67.5)));
        zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 4) / 4) * (20-(-15)));
        zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        yy = 20 + (((tickAnim - 8) / 5) * (52.5-(20)));
        zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        yy = 52.5 + (((tickAnim - 13) / 4) * (67.5-(52.5)));
        zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
        xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        yy = 67.5 + (((tickAnim - 17) / 4) * (-15-(67.5)));
        zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
        xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 21) / 4) * (20-(-15)));
        zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
        xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        yy = 20 + (((tickAnim - 25) / 4) * (52.5-(20)));
        zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        yy = 52.5 + (((tickAnim - 29) / 4) * (67.5-(52.5)));
        zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
        xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        yy = 67.5 + (((tickAnim - 33) / 5) * (-15-(67.5)));
        zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
        xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 38) / 4) * (20-(-15)));
        zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
        xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        yy = 20 + (((tickAnim - 42) / 4) * (52.5-(20)));
        zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        yy = 52.5 + (((tickAnim - 46) / 4) * (67.5-(52.5)));
        zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
        xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        yy = 67.5 + (((tickAnim - 50) / 4) * (-15-(67.5)));
        zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
        xx = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 54) / 4) * (20-(-15)));
        zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
        xx = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        yy = 20 + (((tickAnim - 58) / 5) * (52.5-(20)));
        zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
        xx = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        yy = 52.5 + (((tickAnim - 63) / 4) * (67.5-(52.5)));
        zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
        xx = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        yy = 67.5 + (((tickAnim - 67) / 4) * (-15-(67.5)));
        zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
        xx = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 71) / 4) * (20-(-15)));
        zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
        xx = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        yy = 20 + (((tickAnim - 75) / 4) * (52.5-(20)));
        zz = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
        xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        yy = 52.5 + (((tickAnim - 79) / 4) * (67.5-(52.5)));
        zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
        xx = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        yy = 67.5 + (((tickAnim - 83) / 5) * (-15-(67.5)));
        zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
        xx = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 88) / 4) * (20-(-15)));
        zz = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
        xx = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        yy = 20 + (((tickAnim - 92) / 4) * (52.5-(20)));
        zz = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
        xx = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        yy = 52.5 + (((tickAnim - 96) / 2) * (62.5-(52.5)));
        zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
        xx = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        yy = 62.5 + (((tickAnim - 98) / 2) * (67.5-(62.5)));
        zz = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegFirst2, leftLegFirst2.rotateAngleX + (float) Math.toRadians(xx), leftLegFirst2.rotateAngleY + (float) Math.toRadians(yy), leftLegFirst2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 52.72512 + (((tickAnim - 0) / 8) * (75.94273-(52.72512)));
        yy = -23.00902 + (((tickAnim - 0) / 8) * (9.81037-(-23.00902)));
        zz = 21.73068 + (((tickAnim - 0) / 8) * (23.00066-(21.73068)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 75.94273 + (((tickAnim - 8) / 5) * (52.01465-(75.94273)));
        yy = 9.81037 + (((tickAnim - 8) / 5) * (-9.08804-(9.81037)));
        zz = 23.00066 + (((tickAnim - 8) / 5) * (23.33955-(23.00066)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 52.01465 + (((tickAnim - 13) / 4) * (52.72512-(52.01465)));
        yy = -9.08804 + (((tickAnim - 13) / 4) * (-23.00902-(-9.08804)));
        zz = 23.33955 + (((tickAnim - 13) / 4) * (21.73068-(23.33955)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
        xx = 52.72512 + (((tickAnim - 17) / 8) * (75.94273-(52.72512)));
        yy = -23.00902 + (((tickAnim - 17) / 8) * (9.81037-(-23.00902)));
        zz = 21.73068 + (((tickAnim - 17) / 8) * (23.00066-(21.73068)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
        xx = 75.94273 + (((tickAnim - 25) / 4) * (52.01465-(75.94273)));
        yy = 9.81037 + (((tickAnim - 25) / 4) * (-9.08804-(9.81037)));
        zz = 23.00066 + (((tickAnim - 25) / 4) * (23.33955-(23.00066)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
        xx = 52.01465 + (((tickAnim - 29) / 4) * (52.72512-(52.01465)));
        yy = -9.08804 + (((tickAnim - 29) / 4) * (-23.00902-(-9.08804)));
        zz = 23.33955 + (((tickAnim - 29) / 4) * (21.73068-(23.33955)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
        xx = 52.72512 + (((tickAnim - 33) / 9) * (75.94273-(52.72512)));
        yy = -23.00902 + (((tickAnim - 33) / 9) * (9.81037-(-23.00902)));
        zz = 21.73068 + (((tickAnim - 33) / 9) * (23.00066-(21.73068)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
        xx = 75.94273 + (((tickAnim - 42) / 4) * (52.01465-(75.94273)));
        yy = 9.81037 + (((tickAnim - 42) / 4) * (-9.08804-(9.81037)));
        zz = 23.00066 + (((tickAnim - 42) / 4) * (23.33955-(23.00066)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
        xx = 52.01465 + (((tickAnim - 46) / 4) * (52.72512-(52.01465)));
        yy = -9.08804 + (((tickAnim - 46) / 4) * (-23.00902-(-9.08804)));
        zz = 23.33955 + (((tickAnim - 46) / 4) * (21.73068-(23.33955)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
        xx = 52.72512 + (((tickAnim - 50) / 8) * (75.94273-(52.72512)));
        yy = -23.00902 + (((tickAnim - 50) / 8) * (9.81037-(-23.00902)));
        zz = 21.73068 + (((tickAnim - 50) / 8) * (23.00066-(21.73068)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
        xx = 75.94273 + (((tickAnim - 58) / 5) * (52.01465-(75.94273)));
        yy = 9.81037 + (((tickAnim - 58) / 5) * (-9.08804-(9.81037)));
        zz = 23.00066 + (((tickAnim - 58) / 5) * (23.33955-(23.00066)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
        xx = 52.01465 + (((tickAnim - 63) / 4) * (52.72512-(52.01465)));
        yy = -9.08804 + (((tickAnim - 63) / 4) * (-23.00902-(-9.08804)));
        zz = 23.33955 + (((tickAnim - 63) / 4) * (21.73068-(23.33955)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
        xx = 52.72512 + (((tickAnim - 67) / 8) * (75.94273-(52.72512)));
        yy = -23.00902 + (((tickAnim - 67) / 8) * (9.81037-(-23.00902)));
        zz = 21.73068 + (((tickAnim - 67) / 8) * (23.00066-(21.73068)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
        xx = 75.94273 + (((tickAnim - 75) / 4) * (52.01465-(75.94273)));
        yy = 9.81037 + (((tickAnim - 75) / 4) * (-9.08804-(9.81037)));
        zz = 23.00066 + (((tickAnim - 75) / 4) * (23.33955-(23.00066)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
        xx = 52.01465 + (((tickAnim - 79) / 4) * (52.72512-(52.01465)));
        yy = -9.08804 + (((tickAnim - 79) / 4) * (-23.00902-(-9.08804)));
        zz = 23.33955 + (((tickAnim - 79) / 4) * (21.73068-(23.33955)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
        xx = 52.72512 + (((tickAnim - 83) / 9) * (75.94273-(52.72512)));
        yy = -23.00902 + (((tickAnim - 83) / 9) * (9.81037-(-23.00902)));
        zz = 21.73068 + (((tickAnim - 83) / 9) * (23.00066-(21.73068)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
        xx = 75.94273 + (((tickAnim - 92) / 4) * (52.01465-(75.94273)));
        yy = 9.81037 + (((tickAnim - 92) / 4) * (-9.08804-(9.81037)));
        zz = 23.00066 + (((tickAnim - 92) / 4) * (23.33955-(23.00066)));
        }
        else if (tickAnim >= 96 && tickAnim < 100) {
        xx = 52.01465 + (((tickAnim - 96) / 4) * (52.72512-(52.01465)));
        yy = -9.08804 + (((tickAnim - 96) / 4) * (-23.00902-(-9.08804)));
        zz = 23.33955 + (((tickAnim - 96) / 4) * (21.73068-(23.33955)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegFirst1, rightLegFirst1.rotateAngleX + (float) Math.toRadians(xx), rightLegFirst1.rotateAngleY + (float) Math.toRadians(yy), rightLegFirst1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        yy = -20 + (((tickAnim - 0) / 4) * (-52.5-(-20)));
        zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        yy = -52.5 + (((tickAnim - 4) / 4) * (-67.5-(-52.5)));
        zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        yy = -67.5 + (((tickAnim - 8) / 5) * (15-(-67.5)));
        zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 13) / 4) * (-20-(15)));
        zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
        xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        yy = -20 + (((tickAnim - 17) / 4) * (-52.5-(-20)));
        zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
        xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        yy = -52.5 + (((tickAnim - 21) / 4) * (-67.5-(-52.5)));
        zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
        xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        yy = -67.5 + (((tickAnim - 25) / 4) * (15-(-67.5)));
        zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 29) / 4) * (-20-(15)));
        zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
        xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        yy = -20 + (((tickAnim - 33) / 5) * (-52.5-(-20)));
        zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
        xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        yy = -52.5 + (((tickAnim - 38) / 4) * (-67.5-(-52.5)));
        zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
        xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        yy = -67.5 + (((tickAnim - 42) / 4) * (15-(-67.5)));
        zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 46) / 4) * (-20-(15)));
        zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
        xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        yy = -20 + (((tickAnim - 50) / 4) * (-52.5-(-20)));
        zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
        xx = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        yy = -52.5 + (((tickAnim - 54) / 4) * (-67.5-(-52.5)));
        zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
        xx = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        yy = -67.5 + (((tickAnim - 58) / 5) * (15-(-67.5)));
        zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
        xx = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 63) / 4) * (-20-(15)));
        zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
        xx = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        yy = -20 + (((tickAnim - 67) / 4) * (-52.5-(-20)));
        zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
        xx = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        yy = -52.5 + (((tickAnim - 71) / 4) * (-67.5-(-52.5)));
        zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
        xx = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        yy = -67.5 + (((tickAnim - 75) / 4) * (15-(-67.5)));
        zz = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
        xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 79) / 4) * (-20-(15)));
        zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
        xx = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        yy = -20 + (((tickAnim - 83) / 5) * (-52.5-(-20)));
        zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
        xx = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        yy = -52.5 + (((tickAnim - 88) / 4) * (-67.5-(-52.5)));
        zz = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
        xx = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        yy = -67.5 + (((tickAnim - 92) / 4) * (15-(-67.5)));
        zz = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 100) {
        xx = 0 + (((tickAnim - 96) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 96) / 4) * (-20-(15)));
        zz = 0 + (((tickAnim - 96) / 4) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegFirst2, rightLegFirst2.rotateAngleX + (float) Math.toRadians(xx), rightLegFirst2.rotateAngleY + (float) Math.toRadians(yy), rightLegFirst2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 74.59369 + (((tickAnim - 0) / 8) * (95.83547-(74.59369)));
        yy = 19.11311 + (((tickAnim - 0) / 8) * (-13.85597-(19.11311)));
        zz = -16.16331 + (((tickAnim - 0) / 8) * (-22.385-(-16.16331)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 95.83547 + (((tickAnim - 8) / 5) * (74.09691-(95.83547)));
        yy = -13.85597 + (((tickAnim - 8) / 5) * (-5.70771-(-13.85597)));
        zz = -22.385 + (((tickAnim - 8) / 5) * (-30.56681-(-22.385)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 74.09691 + (((tickAnim - 13) / 4) * (74.59369-(74.09691)));
        yy = -5.70771 + (((tickAnim - 13) / 4) * (19.11311-(-5.70771)));
        zz = -30.56681 + (((tickAnim - 13) / 4) * (-16.16331-(-30.56681)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
        xx = 74.59369 + (((tickAnim - 17) / 8) * (95.83547-(74.59369)));
        yy = 19.11311 + (((tickAnim - 17) / 8) * (-13.85597-(19.11311)));
        zz = -16.16331 + (((tickAnim - 17) / 8) * (-22.385-(-16.16331)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
        xx = 95.83547 + (((tickAnim - 25) / 4) * (74.09691-(95.83547)));
        yy = -13.85597 + (((tickAnim - 25) / 4) * (-5.70771-(-13.85597)));
        zz = -22.385 + (((tickAnim - 25) / 4) * (-30.56681-(-22.385)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
        xx = 74.09691 + (((tickAnim - 29) / 4) * (74.59369-(74.09691)));
        yy = -5.70771 + (((tickAnim - 29) / 4) * (19.11311-(-5.70771)));
        zz = -30.56681 + (((tickAnim - 29) / 4) * (-16.16331-(-30.56681)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
        xx = 74.59369 + (((tickAnim - 33) / 9) * (95.83547-(74.59369)));
        yy = 19.11311 + (((tickAnim - 33) / 9) * (-13.85597-(19.11311)));
        zz = -16.16331 + (((tickAnim - 33) / 9) * (-22.385-(-16.16331)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
        xx = 95.83547 + (((tickAnim - 42) / 4) * (74.09691-(95.83547)));
        yy = -13.85597 + (((tickAnim - 42) / 4) * (-5.70771-(-13.85597)));
        zz = -22.385 + (((tickAnim - 42) / 4) * (-30.56681-(-22.385)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
        xx = 74.09691 + (((tickAnim - 46) / 4) * (74.59369-(74.09691)));
        yy = -5.70771 + (((tickAnim - 46) / 4) * (19.11311-(-5.70771)));
        zz = -30.56681 + (((tickAnim - 46) / 4) * (-16.16331-(-30.56681)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
        xx = 74.59369 + (((tickAnim - 50) / 8) * (95.83547-(74.59369)));
        yy = 19.11311 + (((tickAnim - 50) / 8) * (-13.85597-(19.11311)));
        zz = -16.16331 + (((tickAnim - 50) / 8) * (-22.385-(-16.16331)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
        xx = 95.83547 + (((tickAnim - 58) / 5) * (74.09691-(95.83547)));
        yy = -13.85597 + (((tickAnim - 58) / 5) * (-5.70771-(-13.85597)));
        zz = -22.385 + (((tickAnim - 58) / 5) * (-30.56681-(-22.385)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
        xx = 74.09691 + (((tickAnim - 63) / 4) * (74.59369-(74.09691)));
        yy = -5.70771 + (((tickAnim - 63) / 4) * (19.11311-(-5.70771)));
        zz = -30.56681 + (((tickAnim - 63) / 4) * (-16.16331-(-30.56681)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
        xx = 74.59369 + (((tickAnim - 67) / 8) * (95.83547-(74.59369)));
        yy = 19.11311 + (((tickAnim - 67) / 8) * (-13.85597-(19.11311)));
        zz = -16.16331 + (((tickAnim - 67) / 8) * (-22.385-(-16.16331)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
        xx = 95.83547 + (((tickAnim - 75) / 4) * (74.09691-(95.83547)));
        yy = -13.85597 + (((tickAnim - 75) / 4) * (-5.70771-(-13.85597)));
        zz = -22.385 + (((tickAnim - 75) / 4) * (-30.56681-(-22.385)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
        xx = 74.09691 + (((tickAnim - 79) / 4) * (74.59369-(74.09691)));
        yy = -5.70771 + (((tickAnim - 79) / 4) * (19.11311-(-5.70771)));
        zz = -30.56681 + (((tickAnim - 79) / 4) * (-16.16331-(-30.56681)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
        xx = 74.59369 + (((tickAnim - 83) / 9) * (95.83547-(74.59369)));
        yy = 19.11311 + (((tickAnim - 83) / 9) * (-13.85597-(19.11311)));
        zz = -16.16331 + (((tickAnim - 83) / 9) * (-22.385-(-16.16331)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
        xx = 95.83547 + (((tickAnim - 92) / 4) * (74.09691-(95.83547)));
        yy = -13.85597 + (((tickAnim - 92) / 4) * (-5.70771-(-13.85597)));
        zz = -22.385 + (((tickAnim - 92) / 4) * (-30.56681-(-22.385)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
        xx = 74.09691 + (((tickAnim - 96) / 2) * (74.43-(74.09691)));
        yy = -5.70771 + (((tickAnim - 96) / 2) * (10.84-(-5.70771)));
        zz = -30.56681 + (((tickAnim - 96) / 2) * (-20.96-(-30.56681)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
        xx = 74.43 + (((tickAnim - 98) / 2) * (74.59369-(74.43)));
        yy = 10.84 + (((tickAnim - 98) / 2) * (19.11311-(10.84)));
        zz = -20.96 + (((tickAnim - 98) / 2) * (-16.16331-(-20.96)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegSecond1, leftLegSecond1.rotateAngleX + (float) Math.toRadians(xx), leftLegSecond1.rotateAngleY + (float) Math.toRadians(yy), leftLegSecond1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        yy = 2.5 + (((tickAnim - 0) / 8) * (30-(2.5)));
        zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        yy = 30 + (((tickAnim - 8) / 5) * (-15-(30)));
        zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 13) / 4) * (2.5-(-15)));
        zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
        xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        yy = 2.5 + (((tickAnim - 17) / 8) * (30-(2.5)));
        zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
        xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        yy = 30 + (((tickAnim - 25) / 4) * (-15-(30)));
        zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 29) / 4) * (2.5-(-15)));
        zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
        xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        yy = 2.5 + (((tickAnim - 33) / 9) * (30-(2.5)));
        zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
        xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        yy = 30 + (((tickAnim - 42) / 4) * (-15-(30)));
        zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 46) / 4) * (2.5-(-15)));
        zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
        xx = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        yy = 2.5 + (((tickAnim - 50) / 8) * (30-(2.5)));
        zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
        xx = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        yy = 30 + (((tickAnim - 58) / 5) * (-15-(30)));
        zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
        xx = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 63) / 4) * (2.5-(-15)));
        zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
        xx = 0 + (((tickAnim - 67) / 8) * (0-(0)));
        yy = 2.5 + (((tickAnim - 67) / 8) * (30-(2.5)));
        zz = 0 + (((tickAnim - 67) / 8) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
        xx = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        yy = 30 + (((tickAnim - 75) / 4) * (-15-(30)));
        zz = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
        xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        yy = -15 + (((tickAnim - 79) / 4) * (2.5-(-15)));
        zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
        xx = 0 + (((tickAnim - 83) / 9) * (0-(0)));
        yy = 2.5 + (((tickAnim - 83) / 9) * (30-(2.5)));
        zz = 0 + (((tickAnim - 83) / 9) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
        xx = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        yy = 30 + (((tickAnim - 92) / 4) * (-15-(30)));
        zz = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 98) {
        xx = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        yy = -15 + (((tickAnim - 96) / 2) * (-3.33-(-15)));
        zz = 0 + (((tickAnim - 96) / 2) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
        xx = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        yy = -3.33 + (((tickAnim - 98) / 2) * (2.5-(-3.33)));
        zz = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegSecond2, leftLegSecond2.rotateAngleX + (float) Math.toRadians(xx), leftLegSecond2.rotateAngleY + (float) Math.toRadians(yy), leftLegSecond2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 95.83547 + (((tickAnim - 0) / 4) * (74.09691-(95.83547)));
        yy = 13.85597 + (((tickAnim - 0) / 4) * (5.70771-(13.85597)));
        zz = 22.385 + (((tickAnim - 0) / 4) * (30.56681-(22.385)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 74.09691 + (((tickAnim - 4) / 4) * (74.59369-(74.09691)));
        yy = 5.70771 + (((tickAnim - 4) / 4) * (-19.11311-(5.70771)));
        zz = 30.56681 + (((tickAnim - 4) / 4) * (16.16331-(30.56681)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
        xx = 74.59369 + (((tickAnim - 8) / 9) * (95.83547-(74.59369)));
        yy = -19.11311 + (((tickAnim - 8) / 9) * (13.85597-(-19.11311)));
        zz = 16.16331 + (((tickAnim - 8) / 9) * (22.385-(16.16331)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
        xx = 95.83547 + (((tickAnim - 17) / 4) * (74.09691-(95.83547)));
        yy = 13.85597 + (((tickAnim - 17) / 4) * (5.70771-(13.85597)));
        zz = 22.385 + (((tickAnim - 17) / 4) * (30.56681-(22.385)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
        xx = 74.09691 + (((tickAnim - 21) / 4) * (74.59369-(74.09691)));
        yy = 5.70771 + (((tickAnim - 21) / 4) * (-19.11311-(5.70771)));
        zz = 30.56681 + (((tickAnim - 21) / 4) * (16.16331-(30.56681)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
        xx = 74.59369 + (((tickAnim - 25) / 8) * (95.83547-(74.59369)));
        yy = -19.11311 + (((tickAnim - 25) / 8) * (13.85597-(-19.11311)));
        zz = 16.16331 + (((tickAnim - 25) / 8) * (22.385-(16.16331)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
        xx = 95.83547 + (((tickAnim - 33) / 5) * (74.09691-(95.83547)));
        yy = 13.85597 + (((tickAnim - 33) / 5) * (5.70771-(13.85597)));
        zz = 22.385 + (((tickAnim - 33) / 5) * (30.56681-(22.385)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
        xx = 74.09691 + (((tickAnim - 38) / 4) * (74.59369-(74.09691)));
        yy = 5.70771 + (((tickAnim - 38) / 4) * (-19.11311-(5.70771)));
        zz = 30.56681 + (((tickAnim - 38) / 4) * (16.16331-(30.56681)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
        xx = 74.59369 + (((tickAnim - 42) / 8) * (95.83547-(74.59369)));
        yy = -19.11311 + (((tickAnim - 42) / 8) * (13.85597-(-19.11311)));
        zz = 16.16331 + (((tickAnim - 42) / 8) * (22.385-(16.16331)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
        xx = 95.83547 + (((tickAnim - 50) / 4) * (74.09691-(95.83547)));
        yy = 13.85597 + (((tickAnim - 50) / 4) * (5.70771-(13.85597)));
        zz = 22.385 + (((tickAnim - 50) / 4) * (30.56681-(22.385)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
        xx = 74.09691 + (((tickAnim - 54) / 4) * (74.59369-(74.09691)));
        yy = 5.70771 + (((tickAnim - 54) / 4) * (-19.11311-(5.70771)));
        zz = 30.56681 + (((tickAnim - 54) / 4) * (16.16331-(30.56681)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
        xx = 74.59369 + (((tickAnim - 58) / 9) * (95.83547-(74.59369)));
        yy = -19.11311 + (((tickAnim - 58) / 9) * (13.85597-(-19.11311)));
        zz = 16.16331 + (((tickAnim - 58) / 9) * (22.385-(16.16331)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
        xx = 95.83547 + (((tickAnim - 67) / 4) * (74.09691-(95.83547)));
        yy = 13.85597 + (((tickAnim - 67) / 4) * (5.70771-(13.85597)));
        zz = 22.385 + (((tickAnim - 67) / 4) * (30.56681-(22.385)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
        xx = 74.09691 + (((tickAnim - 71) / 4) * (74.59369-(74.09691)));
        yy = 5.70771 + (((tickAnim - 71) / 4) * (-19.11311-(5.70771)));
        zz = 30.56681 + (((tickAnim - 71) / 4) * (16.16331-(30.56681)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
        xx = 74.59369 + (((tickAnim - 75) / 8) * (95.83547-(74.59369)));
        yy = -19.11311 + (((tickAnim - 75) / 8) * (13.85597-(-19.11311)));
        zz = 16.16331 + (((tickAnim - 75) / 8) * (22.385-(16.16331)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
        xx = 95.83547 + (((tickAnim - 83) / 5) * (74.09691-(95.83547)));
        yy = 13.85597 + (((tickAnim - 83) / 5) * (5.70771-(13.85597)));
        zz = 22.385 + (((tickAnim - 83) / 5) * (30.56681-(22.385)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
        xx = 74.09691 + (((tickAnim - 88) / 4) * (74.59369-(74.09691)));
        yy = 5.70771 + (((tickAnim - 88) / 4) * (-19.11311-(5.70771)));
        zz = 30.56681 + (((tickAnim - 88) / 4) * (16.16331-(30.56681)));
        }
        else if (tickAnim >= 92 && tickAnim < 100) {
        xx = 74.59369 + (((tickAnim - 92) / 8) * (95.83547-(74.59369)));
        yy = -19.11311 + (((tickAnim - 92) / 8) * (13.85597-(-19.11311)));
        zz = 16.16331 + (((tickAnim - 92) / 8) * (22.385-(16.16331)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegSecond1, rightLegSecond1.rotateAngleX + (float) Math.toRadians(xx), rightLegSecond1.rotateAngleY + (float) Math.toRadians(yy), rightLegSecond1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        yy = -30 + (((tickAnim - 0) / 4) * (15-(-30)));
        zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 4) / 4) * (-2.5-(15)));
        zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        yy = -2.5 + (((tickAnim - 8) / 9) * (-30-(-2.5)));
        zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
        xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        yy = -30 + (((tickAnim - 17) / 4) * (15-(-30)));
        zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
        xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 21) / 4) * (-2.5-(15)));
        zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        yy = -2.5 + (((tickAnim - 25) / 8) * (-30-(-2.5)));
        zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
        xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        yy = -30 + (((tickAnim - 33) / 5) * (15-(-30)));
        zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
        xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 38) / 4) * (-2.5-(15)));
        zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
        xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        yy = -2.5 + (((tickAnim - 42) / 8) * (-30-(-2.5)));
        zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
        xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        yy = -30 + (((tickAnim - 50) / 4) * (15-(-30)));
        zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
        xx = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 54) / 4) * (-2.5-(15)));
        zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
        xx = 0 + (((tickAnim - 58) / 9) * (0-(0)));
        yy = -2.5 + (((tickAnim - 58) / 9) * (-30-(-2.5)));
        zz = 0 + (((tickAnim - 58) / 9) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
        xx = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        yy = -30 + (((tickAnim - 67) / 4) * (15-(-30)));
        zz = 0 + (((tickAnim - 67) / 4) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
        xx = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 71) / 4) * (-2.5-(15)));
        zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
        xx = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        yy = -2.5 + (((tickAnim - 75) / 8) * (-30-(-2.5)));
        zz = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
        xx = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        yy = -30 + (((tickAnim - 83) / 5) * (15-(-30)));
        zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
        xx = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        yy = 15 + (((tickAnim - 88) / 4) * (-2.5-(15)));
        zz = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 100) {
        xx = 0 + (((tickAnim - 92) / 8) * (0-(0)));
        yy = -2.5 + (((tickAnim - 92) / 8) * (-30-(-2.5)));
        zz = 0 + (((tickAnim - 92) / 8) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegSecond2, rightLegSecond2.rotateAngleX + (float) Math.toRadians(xx), rightLegSecond2.rotateAngleY + (float) Math.toRadians(yy), rightLegSecond2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 2) {
        xx = 64.85 + (((tickAnim - 0) / 2) * (52.9152-(64.85)));
        yy = -19.9 + (((tickAnim - 0) / 2) * (-13.9894-(-19.9)));
        zz = -16.92 + (((tickAnim - 0) / 2) * (-27.32566-(-16.92)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
        xx = 52.9152 + (((tickAnim - 2) / 4) * (51.71623-(52.9152)));
        yy = -13.9894 + (((tickAnim - 2) / 4) * (-3.69913-(-13.9894)));
        zz = -27.32566 + (((tickAnim - 2) / 4) * (-5.47488-(-27.32566)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
        xx = 51.71623 + (((tickAnim - 6) / 8) * (88.72333-(51.71623)));
        yy = -3.69913 + (((tickAnim - 6) / 8) * (-31.72648-(-3.69913)));
        zz = -5.47488 + (((tickAnim - 6) / 8) * (3.90416-(-5.47488)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
        xx = 88.72333 + (((tickAnim - 14) / 4) * (52.9152-(88.72333)));
        yy = -31.72648 + (((tickAnim - 14) / 4) * (-13.9894-(-31.72648)));
        zz = 3.90416 + (((tickAnim - 14) / 4) * (-27.32566-(3.90416)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
        xx = 52.9152 + (((tickAnim - 18) / 5) * (51.71623-(52.9152)));
        yy = -13.9894 + (((tickAnim - 18) / 5) * (-3.69913-(-13.9894)));
        zz = -27.32566 + (((tickAnim - 18) / 5) * (-5.47488-(-27.32566)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
        xx = 51.71623 + (((tickAnim - 23) / 8) * (88.72333-(51.71623)));
        yy = -3.69913 + (((tickAnim - 23) / 8) * (-31.72648-(-3.69913)));
        zz = -5.47488 + (((tickAnim - 23) / 8) * (3.90416-(-5.47488)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
        xx = 88.72333 + (((tickAnim - 31) / 4) * (52.9152-(88.72333)));
        yy = -31.72648 + (((tickAnim - 31) / 4) * (-13.9894-(-31.72648)));
        zz = 3.90416 + (((tickAnim - 31) / 4) * (-27.32566-(3.90416)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
        xx = 52.9152 + (((tickAnim - 35) / 3) * (51.71623-(52.9152)));
        yy = -13.9894 + (((tickAnim - 35) / 3) * (-3.69913-(-13.9894)));
        zz = -27.32566 + (((tickAnim - 35) / 3) * (-5.47488-(-27.32566)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
        xx = 51.71623 + (((tickAnim - 38) / 9) * (88.72333-(51.71623)));
        yy = -3.69913 + (((tickAnim - 38) / 9) * (-31.72648-(-3.69913)));
        zz = -5.47488 + (((tickAnim - 38) / 9) * (3.90416-(-5.47488)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
        xx = 88.72333 + (((tickAnim - 47) / 4) * (52.9152-(88.72333)));
        yy = -31.72648 + (((tickAnim - 47) / 4) * (-13.9894-(-31.72648)));
        zz = 3.90416 + (((tickAnim - 47) / 4) * (-27.32566-(3.90416)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
        xx = 52.9152 + (((tickAnim - 51) / 4) * (51.71623-(52.9152)));
        yy = -13.9894 + (((tickAnim - 51) / 4) * (-3.69913-(-13.9894)));
        zz = -27.32566 + (((tickAnim - 51) / 4) * (-5.47488-(-27.32566)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
        xx = 51.71623 + (((tickAnim - 55) / 8) * (88.72333-(51.71623)));
        yy = -3.69913 + (((tickAnim - 55) / 8) * (-31.72648-(-3.69913)));
        zz = -5.47488 + (((tickAnim - 55) / 8) * (3.90416-(-5.47488)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
        xx = 88.72333 + (((tickAnim - 63) / 5) * (52.9152-(88.72333)));
        yy = -31.72648 + (((tickAnim - 63) / 5) * (-13.9894-(-31.72648)));
        zz = 3.90416 + (((tickAnim - 63) / 5) * (-27.32566-(3.90416)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
        xx = 52.9152 + (((tickAnim - 68) / 4) * (51.71623-(52.9152)));
        yy = -13.9894 + (((tickAnim - 68) / 4) * (-3.69913-(-13.9894)));
        zz = -27.32566 + (((tickAnim - 68) / 4) * (-5.47488-(-27.32566)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
        xx = 51.71623 + (((tickAnim - 72) / 8) * (88.72333-(51.71623)));
        yy = -3.69913 + (((tickAnim - 72) / 8) * (-31.72648-(-3.69913)));
        zz = -5.47488 + (((tickAnim - 72) / 8) * (3.90416-(-5.47488)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
        xx = 88.72333 + (((tickAnim - 80) / 4) * (52.9152-(88.72333)));
        yy = -31.72648 + (((tickAnim - 80) / 4) * (-13.9894-(-31.72648)));
        zz = 3.90416 + (((tickAnim - 80) / 4) * (-27.32566-(3.90416)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
        xx = 52.9152 + (((tickAnim - 84) / 4) * (51.71623-(52.9152)));
        yy = -13.9894 + (((tickAnim - 84) / 4) * (-3.69913-(-13.9894)));
        zz = -27.32566 + (((tickAnim - 84) / 4) * (-5.47488-(-27.32566)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
        xx = 51.71623 + (((tickAnim - 88) / 4) * (64.05-(51.71623)));
        yy = -3.69913 + (((tickAnim - 88) / 4) * (-13.04-(-3.69913)));
        zz = -5.47488 + (((tickAnim - 88) / 4) * (-2.35-(-5.47488)));
        }
        else if (tickAnim >= 92 && tickAnim < 97) {
        xx = 64.05 + (((tickAnim - 92) / 5) * (88.72333-(64.05)));
        yy = -13.04 + (((tickAnim - 92) / 5) * (-31.72648-(-13.04)));
        zz = -2.35 + (((tickAnim - 92) / 5) * (3.90416-(-2.35)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
        xx = 88.72333 + (((tickAnim - 97) / 1) * (76.79-(88.72333)));
        yy = -31.72648 + (((tickAnim - 97) / 1) * (-25.81-(-31.72648)));
        zz = 3.90416 + (((tickAnim - 97) / 1) * (-6.51-(3.90416)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
        xx = 76.79 + (((tickAnim - 98) / 2) * (64.85-(76.79)));
        yy = -25.81 + (((tickAnim - 98) / 2) * (-19.9-(-25.81)));
        zz = -6.51 + (((tickAnim - 98) / 2) * (-16.92-(-6.51)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegThird, leftLegThird.rotateAngleX + (float) Math.toRadians(xx), leftLegThird.rotateAngleY + (float) Math.toRadians(yy), leftLegThird.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 6) {
        xx = 64.05 + (((tickAnim - 0) / 6) * (88.72333-(64.05)));
        yy = 13.04 + (((tickAnim - 0) / 6) * (31.72648-(13.04)));
        zz = 2.35 + (((tickAnim - 0) / 6) * (-3.90416-(2.35)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
        xx = 88.72333 + (((tickAnim - 6) / 4) * (52.9152-(88.72333)));
        yy = 31.72648 + (((tickAnim - 6) / 4) * (13.9894-(31.72648)));
        zz = -3.90416 + (((tickAnim - 6) / 4) * (27.32566-(-3.90416)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
        xx = 52.9152 + (((tickAnim - 10) / 4) * (51.71623-(52.9152)));
        yy = 13.9894 + (((tickAnim - 10) / 4) * (3.69913-(13.9894)));
        zz = 27.32566 + (((tickAnim - 10) / 4) * (5.47488-(27.32566)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
        xx = 51.71623 + (((tickAnim - 14) / 9) * (88.72333-(51.71623)));
        yy = 3.69913 + (((tickAnim - 14) / 9) * (31.72648-(3.69913)));
        zz = 5.47488 + (((tickAnim - 14) / 9) * (-3.90416-(5.47488)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
        xx = 88.72333 + (((tickAnim - 23) / 4) * (52.9152-(88.72333)));
        yy = 31.72648 + (((tickAnim - 23) / 4) * (13.9894-(31.72648)));
        zz = -3.90416 + (((tickAnim - 23) / 4) * (27.32566-(-3.90416)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
        xx = 52.9152 + (((tickAnim - 27) / 4) * (51.71623-(52.9152)));
        yy = 13.9894 + (((tickAnim - 27) / 4) * (3.69913-(13.9894)));
        zz = 27.32566 + (((tickAnim - 27) / 4) * (5.47488-(27.32566)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
        xx = 51.71623 + (((tickAnim - 31) / 7) * (88.72333-(51.71623)));
        yy = 3.69913 + (((tickAnim - 31) / 7) * (31.72648-(3.69913)));
        zz = 5.47488 + (((tickAnim - 31) / 7) * (-3.90416-(5.47488)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
        xx = 88.72333 + (((tickAnim - 38) / 5) * (52.9152-(88.72333)));
        yy = 31.72648 + (((tickAnim - 38) / 5) * (13.9894-(31.72648)));
        zz = -3.90416 + (((tickAnim - 38) / 5) * (27.32566-(-3.90416)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
        xx = 52.9152 + (((tickAnim - 43) / 4) * (51.71623-(52.9152)));
        yy = 13.9894 + (((tickAnim - 43) / 4) * (3.69913-(13.9894)));
        zz = 27.32566 + (((tickAnim - 43) / 4) * (5.47488-(27.32566)));
        }
        else if (tickAnim >= 47 && tickAnim < 55) {
        xx = 51.71623 + (((tickAnim - 47) / 8) * (88.72333-(51.71623)));
        yy = 3.69913 + (((tickAnim - 47) / 8) * (31.72648-(3.69913)));
        zz = 5.47488 + (((tickAnim - 47) / 8) * (-3.90416-(5.47488)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
        xx = 88.72333 + (((tickAnim - 55) / 4) * (52.9152-(88.72333)));
        yy = 31.72648 + (((tickAnim - 55) / 4) * (13.9894-(31.72648)));
        zz = -3.90416 + (((tickAnim - 55) / 4) * (27.32566-(-3.90416)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
        xx = 52.9152 + (((tickAnim - 59) / 4) * (51.71623-(52.9152)));
        yy = 13.9894 + (((tickAnim - 59) / 4) * (3.69913-(13.9894)));
        zz = 27.32566 + (((tickAnim - 59) / 4) * (5.47488-(27.32566)));
        }
        else if (tickAnim >= 63 && tickAnim < 72) {
        xx = 51.71623 + (((tickAnim - 63) / 9) * (88.72333-(51.71623)));
        yy = 3.69913 + (((tickAnim - 63) / 9) * (31.72648-(3.69913)));
        zz = 5.47488 + (((tickAnim - 63) / 9) * (-3.90416-(5.47488)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
        xx = 88.72333 + (((tickAnim - 72) / 4) * (52.9152-(88.72333)));
        yy = 31.72648 + (((tickAnim - 72) / 4) * (13.9894-(31.72648)));
        zz = -3.90416 + (((tickAnim - 72) / 4) * (27.32566-(-3.90416)));
        }
        else if (tickAnim >= 76 && tickAnim < 80) {
        xx = 52.9152 + (((tickAnim - 76) / 4) * (51.71623-(52.9152)));
        yy = 13.9894 + (((tickAnim - 76) / 4) * (3.69913-(13.9894)));
        zz = 27.32566 + (((tickAnim - 76) / 4) * (5.47488-(27.32566)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
        xx = 51.71623 + (((tickAnim - 80) / 8) * (88.72333-(51.71623)));
        yy = 3.69913 + (((tickAnim - 80) / 8) * (31.72648-(3.69913)));
        zz = 5.47488 + (((tickAnim - 80) / 8) * (-3.90416-(5.47488)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
        xx = 88.72333 + (((tickAnim - 88) / 5) * (52.9152-(88.72333)));
        yy = 31.72648 + (((tickAnim - 88) / 5) * (13.9894-(31.72648)));
        zz = -3.90416 + (((tickAnim - 88) / 5) * (27.32566-(-3.90416)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
        xx = 52.9152 + (((tickAnim - 93) / 4) * (51.71623-(52.9152)));
        yy = 13.9894 + (((tickAnim - 93) / 4) * (3.69913-(13.9894)));
        zz = 27.32566 + (((tickAnim - 93) / 4) * (5.47488-(27.32566)));
        }
        else if (tickAnim >= 97 && tickAnim < 100) {
        xx = 51.71623 + (((tickAnim - 97) / 3) * (64.05-(51.71623)));
        yy = 3.69913 + (((tickAnim - 97) / 3) * (13.04-(3.69913)));
        zz = 5.47488 + (((tickAnim - 97) / 3) * (2.35-(5.47488)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegThird, rightLegThird.rotateAngleX + (float) Math.toRadians(xx), rightLegThird.rotateAngleY + (float) Math.toRadians(yy), rightLegThird.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftPaddle1, leftPaddle1.rotateAngleX + (float) Math.toRadians(-10), leftPaddle1.rotateAngleY + (float) Math.toRadians(-20), leftPaddle1.rotateAngleZ + (float) Math.toRadians(18));


        this.setRotateAngle(rightPaddle1, rightPaddle1.rotateAngleX + (float) Math.toRadians(-10), rightPaddle1.rotateAngleY + (float) Math.toRadians(20), rightPaddle1.rotateAngleZ + (float) Math.toRadians(-18));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4-50*5))*4), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2-50))*4), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4-50*2))*4), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2-50*2))*4), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4-50*3))*4), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2-50*3))*4), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4-50*4))*4), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2-50*4))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4-50*5))*4), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2-50*5))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4-50*6))*4), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2-50*6))*6), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*4-50*6))*4), telson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72*2-50*6))*7), telson.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraEusarcana entity = (EntityPrehistoricFloraEusarcana) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Eusarcana, Eusarcana.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*2))*8), Eusarcana.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201+60))*4), Eusarcana.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*3))*4));
        this.Eusarcana.rotationPointX = this.Eusarcana.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-60*3))*1);
        this.Eusarcana.rotationPointY = this.Eusarcana.rotationPointY - (float)(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*2))*2);
        this.Eusarcana.rotationPointZ = this.Eusarcana.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60))*1);


        this.setRotateAngle(leftPaddle1, leftPaddle1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60))*20), leftPaddle1.rotateAngleY + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*3))*40), leftPaddle1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2))*40));


        this.setRotateAngle(leftPaddle2, leftPaddle2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60*2))*40), leftPaddle2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*30), leftPaddle2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60))*30));


        this.setRotateAngle(leftPaddle3, leftPaddle3.rotateAngleX + (float) Math.toRadians(0), leftPaddle3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*30), leftPaddle3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60))*30));


        this.setRotateAngle(rightPaddle1, rightPaddle1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60))*20), rightPaddle1.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*3))*40), rightPaddle1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2))*40));


        this.setRotateAngle(rightPaddle2, rightPaddle2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60*2))*40), rightPaddle2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*30), rightPaddle2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60))*30));


        this.setRotateAngle(rightPaddle3, rightPaddle3.rotateAngleX + (float) Math.toRadians(0), rightPaddle3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*30), rightPaddle3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-60))*30));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-30))*6), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-30))*3), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-30*2))*6), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-30*2))*3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-30*3))*6), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-30*3))*3), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-30*4))*5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-30*4))*2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-30*5))*4), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-30*5))*2), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-30*6))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-30*6))*2), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2-30*7))*2), telson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201-30*7))*2), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightPedipalp, rightPedipalp.rotateAngleX + (float) Math.toRadians(0), rightPedipalp.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*3))*3), rightPedipalp.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLegFirst1, rightLegFirst1.rotateAngleX + (float) Math.toRadians(0), rightLegFirst1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*2))*3), rightLegFirst1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*3))*6));


        this.setRotateAngle(rightLegFirst2, rightLegFirst2.rotateAngleX + (float) Math.toRadians(0), rightLegFirst2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*6), rightLegFirst2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLegSecond1, rightLegSecond1.rotateAngleX + (float) Math.toRadians(0), rightLegSecond1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*3), rightLegSecond1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*2))*3));


        this.setRotateAngle(rightLegSecond2, rightLegSecond2.rotateAngleX + (float) Math.toRadians(0), rightLegSecond2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2))*6), rightLegSecond2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLegThird, rightLegThird.rotateAngleX + (float) Math.toRadians(0), rightLegThird.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2))*3), rightLegThird.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftPedipalp, leftPedipalp.rotateAngleX + (float) Math.toRadians(0), leftPedipalp.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*3))*3), leftPedipalp.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLegFirst1, leftLegFirst1.rotateAngleX + (float) Math.toRadians(0), leftLegFirst1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*2))*3), leftLegFirst1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*3))*6));


        this.setRotateAngle(leftLegFirst2, leftLegFirst2.rotateAngleX + (float) Math.toRadians(0), leftLegFirst2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*6), leftLegFirst2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLegSecond1, leftLegSecond1.rotateAngleX + (float) Math.toRadians(0), leftLegSecond1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60))*3), leftLegSecond1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2+60*2))*3));


        this.setRotateAngle(leftLegSecond2, leftLegSecond2.rotateAngleX + (float) Math.toRadians(0), leftLegSecond2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270*2))*6), leftLegSecond2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLegThird, leftLegThird.rotateAngleX + (float) Math.toRadians(0), leftLegThird.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*201*2))*3), leftLegThird.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEusarcana e = (EntityPrehistoricFloraEusarcana) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.startKeyframe(e.swimTransitionLength()); //move to this keyframe over the right length
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.startKeyframe(e.unswimTransitionLength()); //move to this keyframe over the right length
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
