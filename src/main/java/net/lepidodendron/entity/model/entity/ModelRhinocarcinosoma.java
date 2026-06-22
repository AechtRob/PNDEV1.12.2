package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRhinocarcinosoma;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelRhinocarcinosoma extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Rhinocarcinosoma;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftPedipalp;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightPedipalp;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLegFirst1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLegFirst1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLegSecond1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLegSecond1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLegThird1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLegThird1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftPaddle1;
    private final AdvancedModelRenderer leftPaddle2;
    private final AdvancedModelRenderer rightPaddle1;
    private final AdvancedModelRenderer rightPaddle2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer cube_r13;

    private ModelAnimator animator;

    public ModelRhinocarcinosoma() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.Rhinocarcinosoma = new AdvancedModelRenderer(this);
        this.Rhinocarcinosoma.setRotationPoint(0.0F, 22.75F, -4.25F);
        this.Rhinocarcinosoma.cubeList.add(new ModelBox(Rhinocarcinosoma, 8, 36, -0.5F, -0.75F, -4.75F, 1, 1, 3, 0.0F, false));
        this.Rhinocarcinosoma.cubeList.add(new ModelBox(Rhinocarcinosoma, 33, 22, -2.5F, -0.75F, -1.0F, 5, 1, 1, 0.02F, false));
        this.Rhinocarcinosoma.cubeList.add(new ModelBox(Rhinocarcinosoma, 35, 27, -1.5F, -0.75F, -2.5F, 3, 1, 2, 0.01F, false));
        this.Rhinocarcinosoma.cubeList.add(new ModelBox(Rhinocarcinosoma, 19, 34, -1.5F, -0.25F, -2.0F, 3, 1, 2, 0.01F, false));
        this.Rhinocarcinosoma.cubeList.add(new ModelBox(Rhinocarcinosoma, 17, 38, -1.0F, -0.25F, -3.5F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.75F, -3.0F);
        this.Rhinocarcinosoma.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0436F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 39, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, 0.25F, -1.0F);
        this.Rhinocarcinosoma.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0472F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 0, 0.0F, -1.0F, 0.0F, 4, 1, 1, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, 0.25F, -1.0F);
        this.Rhinocarcinosoma.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.0472F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 0, -4.0F, -1.0F, 0.0F, 4, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.75F, -3.0F);
        this.Rhinocarcinosoma.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 39, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftPedipalp = new AdvancedModelRenderer(this);
        this.leftPedipalp.setRotationPoint(0.0F, 0.25F, -3.5F);
        this.Rhinocarcinosoma.addChild(leftPedipalp);
        this.setRotateAngle(leftPedipalp, 0.0F, 0.6109F, 0.0873F);
        this.leftPedipalp.cubeList.add(new ModelBox(leftPedipalp, 18, 31, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.leftPedipalp.cubeList.add(new ModelBox(leftPedipalp, 0, 24, 0.75F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 0.0F, 0.5F);
        this.leftPedipalp.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.48F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 24, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.rightPedipalp = new AdvancedModelRenderer(this);
        this.rightPedipalp.setRotationPoint(0.0F, 0.25F, -3.5F);
        this.Rhinocarcinosoma.addChild(rightPedipalp);
        this.setRotateAngle(rightPedipalp, 0.0F, -0.6109F, -0.0873F);
        this.rightPedipalp.cubeList.add(new ModelBox(rightPedipalp, 18, 31, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.rightPedipalp.cubeList.add(new ModelBox(rightPedipalp, 0, 24, -1.75F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.rightPedipalp.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 24, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftLegFirst1 = new AdvancedModelRenderer(this);
        this.leftLegFirst1.setRotationPoint(0.5F, 0.75F, -2.5F);
        this.Rhinocarcinosoma.addChild(leftLegFirst1);
        this.setRotateAngle(leftLegFirst1, 0.0F, 0.6109F, 0.2182F);
        this.leftLegFirst1.cubeList.add(new ModelBox(leftLegFirst1, 36, 17, 0.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.leftLegFirst1.cubeList.add(new ModelBox(leftLegFirst1, 12, 21, 0.75F, -0.5F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.0F, -0.5F, 0.5F);
        this.leftLegFirst1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 6, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.rightLegFirst1 = new AdvancedModelRenderer(this);
        this.rightLegFirst1.setRotationPoint(-0.5F, 0.75F, -2.5F);
        this.Rhinocarcinosoma.addChild(rightLegFirst1);
        this.setRotateAngle(rightLegFirst1, 0.0F, -0.6109F, -0.2182F);
        this.rightLegFirst1.cubeList.add(new ModelBox(rightLegFirst1, 36, 17, -4.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F, true));
        this.rightLegFirst1.cubeList.add(new ModelBox(rightLegFirst1, 12, 21, -3.75F, -0.5F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.0F, -0.5F, 0.5F);
        this.rightLegFirst1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.48F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 6, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftLegSecond1 = new AdvancedModelRenderer(this);
        this.leftLegSecond1.setRotationPoint(0.75F, 0.75F, -1.75F);
        this.Rhinocarcinosoma.addChild(leftLegSecond1);
        this.setRotateAngle(leftLegSecond1, 0.0F, 0.3927F, 0.48F);
        this.leftLegSecond1.cubeList.add(new ModelBox(leftLegSecond1, 30, 36, 0.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F, false));
        this.leftLegSecond1.cubeList.add(new ModelBox(leftLegSecond1, 35, 25, 0.75F, -0.5F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.0F, -0.5F, 0.5F);
        this.leftLegSecond1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 34, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.rightLegSecond1 = new AdvancedModelRenderer(this);
        this.rightLegSecond1.setRotationPoint(-0.75F, 0.75F, -1.75F);
        this.Rhinocarcinosoma.addChild(rightLegSecond1);
        this.setRotateAngle(rightLegSecond1, 0.0F, -0.3927F, -0.48F);
        this.rightLegSecond1.cubeList.add(new ModelBox(rightLegSecond1, 30, 36, -4.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F, true));
        this.rightLegSecond1.cubeList.add(new ModelBox(rightLegSecond1, 35, 25, -3.75F, -0.5F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.0F, -0.5F, 0.5F);
        this.rightLegSecond1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.48F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 34, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftLegThird1 = new AdvancedModelRenderer(this);
        this.leftLegThird1.setRotationPoint(0.75F, 0.75F, -1.25F);
        this.Rhinocarcinosoma.addChild(leftLegThird1);
        this.setRotateAngle(leftLegThird1, 0.0F, 0.1309F, 0.7418F);
        this.leftLegThird1.cubeList.add(new ModelBox(leftLegThird1, 38, 11, 0.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.leftLegThird1.cubeList.add(new ModelBox(leftLegThird1, 14, 36, 1.75F, -0.5F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.0F, -0.5F, 0.5F);
        this.leftLegThird1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.48F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 20, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.rightLegThird1 = new AdvancedModelRenderer(this);
        this.rightLegThird1.setRotationPoint(-0.75F, 0.75F, -1.25F);
        this.Rhinocarcinosoma.addChild(rightLegThird1);
        this.setRotateAngle(rightLegThird1, 0.0F, -0.1309F, -0.7418F);
        this.rightLegThird1.cubeList.add(new ModelBox(rightLegThird1, 38, 11, -3.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, true));
        this.rightLegThird1.cubeList.add(new ModelBox(rightLegThird1, 14, 36, -2.75F, -0.5F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, -0.5F, 0.5F);
        this.rightLegThird1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.48F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 20, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftPaddle1 = new AdvancedModelRenderer(this);
        this.leftPaddle1.setRotationPoint(1.5F, 0.75F, -0.75F);
        this.Rhinocarcinosoma.addChild(leftPaddle1);
        this.setRotateAngle(leftPaddle1, 0.0F, -0.1309F, 0.48F);
        this.leftPaddle1.cubeList.add(new ModelBox(leftPaddle1, 26, 39, -0.5F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.leftPaddle2 = new AdvancedModelRenderer(this);
        this.leftPaddle2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.leftPaddle1.addChild(leftPaddle2);
        this.setRotateAngle(leftPaddle2, 0.0F, -0.1745F, 0.0F);
        this.leftPaddle2.cubeList.add(new ModelBox(leftPaddle2, 24, 25, 0.0F, -1.0F, -0.5F, 4, 1, 2, 0.0F, false));

        this.rightPaddle1 = new AdvancedModelRenderer(this);
        this.rightPaddle1.setRotationPoint(-1.5F, 0.75F, -0.75F);
        this.Rhinocarcinosoma.addChild(rightPaddle1);
        this.setRotateAngle(rightPaddle1, 0.0F, 0.1309F, -0.48F);
        this.rightPaddle1.cubeList.add(new ModelBox(rightPaddle1, 26, 39, -2.5F, -1.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.rightPaddle2 = new AdvancedModelRenderer(this);
        this.rightPaddle2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.rightPaddle1.addChild(rightPaddle2);
        this.setRotateAngle(rightPaddle2, 0.0F, 0.1745F, 0.0F);
        this.rightPaddle2.cubeList.add(new ModelBox(rightPaddle2, 24, 25, -4.0F, -1.0F, -0.5F, 4, 1, 2, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rhinocarcinosoma.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 21, -1.5F, -0.75F, -0.25F, 3, 1, 5, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -6.0F, -0.5F, 2.75F, 12, 1, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 15, -5.5F, -0.5F, 1.75F, 11, 1, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 25, 14, -3.5F, -0.5F, -0.25F, 7, 1, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 16, 18, -1.5F, -0.25F, -0.25F, 3, 1, 5, -0.01F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 18, -4.5F, -0.5F, 0.75F, 9, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 13, 25, -1.5F, -0.75F, 0.0F, 3, 1, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 8, -5.5F, -0.5F, 2.0F, 11, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 4, -6.0F, -0.5F, 0.0F, 12, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -5.0F, 0.0F, 4.0F, 10, 0, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 23, 8, -1.5F, -0.25F, -0.1F, 3, 1, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 28, -1.5F, -0.75F, -0.25F, 3, 1, 3, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 27, 1, -1.5F, -0.25F, -0.25F, 3, 1, 3, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 31, -1.0F, -0.75F, 0.0F, 2, 1, 3, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 17, -1.0F, -0.25F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 10, 31, -1.0F, -0.75F, 0.0F, 2, 1, 3, 0.02F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 6, -1.0F, -0.25F, 0.0F, 2, 1, 3, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 33, -1.0F, -0.75F, 0.0F, 2, 1, 3, 0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 29, -1.0F, -0.25F, 0.0F, 2, 1, 3, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail4.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 0, 21, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.5F, 1.0F);
        this.telson.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, -0.0436F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 38, -1.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Rhinocarcinosoma.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Rhinocarcinosoma.rotateAngleY = (float) Math.toRadians(360);
        this.setRotateAngle(Rhinocarcinosoma, 1.5F, 0.0F, -0.25F);
        this.Rhinocarcinosoma.offsetY = -0.2F;
        this.Rhinocarcinosoma.offsetX = 0.02F;
        this.Rhinocarcinosoma.offsetZ = -0.29F;
        this.Rhinocarcinosoma.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Rhinocarcinosoma.offsetY = -1.0F;
        this.Rhinocarcinosoma.offsetX = 0.0F;
        this.Rhinocarcinosoma.offsetZ = 2.0F;
        this.Rhinocarcinosoma.rotateAngleY = (float)Math.toRadians(120);
        this.Rhinocarcinosoma.rotateAngleX = (float)Math.toRadians(1);
        this.Rhinocarcinosoma.rotateAngleZ = (float)Math.toRadians(0);
        this.Rhinocarcinosoma.scaleChildren = true;
        float scaler = 1.F;
        this.Rhinocarcinosoma.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Rhinocarcinosoma, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Rhinocarcinosoma.render(f);
        //Reset rotations, positions and sizing:
        this.Rhinocarcinosoma.setScale(1.0F, 1.0F, 1.0F);
        this.Rhinocarcinosoma.scaleChildren = false;
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
        this.Rhinocarcinosoma.offsetY = -0.25F;
        this.Rhinocarcinosoma.offsetZ = 0.1F;

        AdvancedModelRenderer[] fishBody = {this.body1, this.body2, this.tail1, this.tail2, this.tail3, this.tail4, this.telson};
        AdvancedModelRenderer[] fishTail = {this.tail4, this.telson};

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraRhinocarcinosoma ciurc = (EntityPrehistoricFloraRhinocarcinosoma) e;


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
                this.bob(Rhinocarcinosoma, -speed * 5.0F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed * 3.0F, 0.05F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRhinocarcinosoma ee = (EntityPrehistoricFloraRhinocarcinosoma) entitylivingbaseIn;
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
        EntityPrehistoricFloraRhinocarcinosoma entity = (EntityPrehistoricFloraRhinocarcinosoma) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Rhinocarcinosoma, Rhinocarcinosoma.rotateAngleX + (float) Math.toRadians(4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60))*2), Rhinocarcinosoma.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60))*4), Rhinocarcinosoma.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3))*3));
        this.Rhinocarcinosoma.rotationPointX = this.Rhinocarcinosoma.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200))*0.2);
        this.Rhinocarcinosoma.rotationPointY = this.Rhinocarcinosoma.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3+60))*0.1);
        this.Rhinocarcinosoma.rotationPointZ = this.Rhinocarcinosoma.rotationPointZ + (float)(0);


        this.setRotateAngle(leftPedipalp, leftPedipalp.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3-60))*5), leftPedipalp.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*8-60))*3), leftPedipalp.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*6-60))*10));


        this.setRotateAngle(rightPedipalp, rightPedipalp.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3))*5), rightPedipalp.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*8))*3), rightPedipalp.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*6))*10));



         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 59.08 + (((tickAnim - 0) / 1) * (66.61101-(59.08)));
        yy = 9.81 + (((tickAnim - 0) / 1) * (15.61148-(9.81)));
        zz = -4.8 + (((tickAnim - 0) / 1) * (0.8544-(-4.8)));
    }
            else if (tickAnim >= 1 && tickAnim < 7) {
    xx = 66.61101 + (((tickAnim - 1) / 6) * (59.45383-(66.61101)));
    yy = 15.61148 + (((tickAnim - 1) / 6) * (-11.2519-(15.61148)));
    zz = 0.8544 + (((tickAnim - 1) / 6) * (-1.64016-(0.8544)));
}
        else if (tickAnim >= 7 && tickAnim < 10) {
        xx = 59.45383 + (((tickAnim - 7) / 3) * (44.01057-(59.45383)));
        yy = -11.2519 + (((tickAnim - 7) / 3) * (-1.79954-(-11.2519)));
        zz = -1.64016 + (((tickAnim - 7) / 3) * (-16.09791-(-1.64016)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 44.01057 + (((tickAnim - 10) / 3) * (66.61101-(44.01057)));
        yy = -1.79954 + (((tickAnim - 10) / 3) * (15.61148-(-1.79954)));
        zz = -16.09791 + (((tickAnim - 10) / 3) * (0.8544-(-16.09791)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
        xx = 66.61101 + (((tickAnim - 13) / 6) * (59.45383-(66.61101)));
        yy = 15.61148 + (((tickAnim - 13) / 6) * (-11.2519-(15.61148)));
        zz = 0.8544 + (((tickAnim - 13) / 6) * (-1.64016-(0.8544)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
        xx = 59.45383 + (((tickAnim - 19) / 3) * (44.01057-(59.45383)));
        yy = -11.2519 + (((tickAnim - 19) / 3) * (-1.79954-(-11.2519)));
        zz = -1.64016 + (((tickAnim - 19) / 3) * (-16.09791-(-1.64016)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
        xx = 44.01057 + (((tickAnim - 22) / 3) * (66.61101-(44.01057)));
        yy = -1.79954 + (((tickAnim - 22) / 3) * (15.61148-(-1.79954)));
        zz = -16.09791 + (((tickAnim - 22) / 3) * (0.8544-(-16.09791)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
        xx = 66.61101 + (((tickAnim - 25) / 6) * (59.45383-(66.61101)));
        yy = 15.61148 + (((tickAnim - 25) / 6) * (-11.2519-(15.61148)));
        zz = 0.8544 + (((tickAnim - 25) / 6) * (-1.64016-(0.8544)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
        xx = 59.45383 + (((tickAnim - 31) / 3) * (44.01057-(59.45383)));
        yy = -11.2519 + (((tickAnim - 31) / 3) * (-1.79954-(-11.2519)));
        zz = -1.64016 + (((tickAnim - 31) / 3) * (-16.09791-(-1.64016)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
        xx = 44.01057 + (((tickAnim - 34) / 2) * (59.08-(44.01057)));
        yy = -1.79954 + (((tickAnim - 34) / 2) * (9.81-(-1.79954)));
        zz = -16.09791 + (((tickAnim - 34) / 2) * (-4.8-(-16.09791)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegFirst1, leftLegFirst1.rotateAngleX + (float) Math.toRadians(xx), leftLegFirst1.rotateAngleY + (float) Math.toRadians(yy), leftLegFirst1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 59.45383 + (((tickAnim - 0) / 3) * (44.01057-(59.45383)));
        yy = 11.2519 + (((tickAnim - 0) / 3) * (1.79954-(11.2519)));
        zz = 1.64016 + (((tickAnim - 0) / 3) * (16.09791-(1.64016)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
        xx = 44.01057 + (((tickAnim - 3) / 3) * (66.61101-(44.01057)));
        yy = 1.79954 + (((tickAnim - 3) / 3) * (-15.61148-(1.79954)));
        zz = 16.09791 + (((tickAnim - 3) / 3) * (-0.8544-(16.09791)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
        xx = 66.61101 + (((tickAnim - 6) / 6) * (59.45383-(66.61101)));
        yy = -15.61148 + (((tickAnim - 6) / 6) * (11.2519-(-15.61148)));
        zz = -0.8544 + (((tickAnim - 6) / 6) * (1.64016-(-0.8544)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
        xx = 59.45383 + (((tickAnim - 12) / 3) * (44.01057-(59.45383)));
        yy = 11.2519 + (((tickAnim - 12) / 3) * (1.79954-(11.2519)));
        zz = 1.64016 + (((tickAnim - 12) / 3) * (16.09791-(1.64016)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
        xx = 44.01057 + (((tickAnim - 15) / 3) * (66.61101-(44.01057)));
        yy = 1.79954 + (((tickAnim - 15) / 3) * (-15.61148-(1.79954)));
        zz = 16.09791 + (((tickAnim - 15) / 3) * (-0.8544-(16.09791)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
        xx = 66.61101 + (((tickAnim - 18) / 6) * (59.45383-(66.61101)));
        yy = -15.61148 + (((tickAnim - 18) / 6) * (11.2519-(-15.61148)));
        zz = -0.8544 + (((tickAnim - 18) / 6) * (1.64016-(-0.8544)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
        xx = 59.45383 + (((tickAnim - 24) / 3) * (44.01057-(59.45383)));
        yy = 11.2519 + (((tickAnim - 24) / 3) * (1.79954-(11.2519)));
        zz = 1.64016 + (((tickAnim - 24) / 3) * (16.09791-(1.64016)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 44.01057 + (((tickAnim - 27) / 3) * (66.61101-(44.01057)));
        yy = 1.79954 + (((tickAnim - 27) / 3) * (-15.61148-(1.79954)));
        zz = 16.09791 + (((tickAnim - 27) / 3) * (-0.8544-(16.09791)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
        xx = 66.61101 + (((tickAnim - 30) / 6) * (59.45383-(66.61101)));
        yy = -15.61148 + (((tickAnim - 30) / 6) * (11.2519-(-15.61148)));
        zz = -0.8544 + (((tickAnim - 30) / 6) * (1.64016-(-0.8544)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegFirst1, rightLegFirst1.rotateAngleX + (float) Math.toRadians(xx), rightLegFirst1.rotateAngleY + (float) Math.toRadians(yy), rightLegFirst1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 66.87 + (((tickAnim - 0) / 3) * (55.39764-(66.87)));
        yy = -27.54 + (((tickAnim - 0) / 3) * (-13.99201-(-27.54)));
        zz = -16.68 + (((tickAnim - 0) / 3) * (-34.92739-(-16.68)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
        xx = 55.39764 + (((tickAnim - 3) / 3) * (70.4185-(55.39764)));
        yy = -13.99201 + (((tickAnim - 3) / 3) * (-7.89994-(-13.99201)));
        zz = -34.92739 + (((tickAnim - 3) / 3) * (-17.78576-(-34.92739)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
        xx = 70.4185 + (((tickAnim - 6) / 6) * (66.867-(70.4185)));
        yy = -7.89994 + (((tickAnim - 6) / 6) * (-27.5375-(-7.89994)));
        zz = -17.78576 + (((tickAnim - 6) / 6) * (-16.67686-(-17.78576)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
        xx = 66.867 + (((tickAnim - 12) / 3) * (55.39764-(66.867)));
        yy = -27.5375 + (((tickAnim - 12) / 3) * (-13.99201-(-27.5375)));
        zz = -16.67686 + (((tickAnim - 12) / 3) * (-34.92739-(-16.67686)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
        xx = 55.39764 + (((tickAnim - 15) / 3) * (70.4185-(55.39764)));
        yy = -13.99201 + (((tickAnim - 15) / 3) * (-7.89994-(-13.99201)));
        zz = -34.92739 + (((tickAnim - 15) / 3) * (-17.78576-(-34.92739)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
        xx = 70.4185 + (((tickAnim - 18) / 6) * (66.867-(70.4185)));
        yy = -7.89994 + (((tickAnim - 18) / 6) * (-27.5375-(-7.89994)));
        zz = -17.78576 + (((tickAnim - 18) / 6) * (-16.67686-(-17.78576)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
        xx = 66.867 + (((tickAnim - 24) / 3) * (55.39764-(66.867)));
        yy = -27.5375 + (((tickAnim - 24) / 3) * (-13.99201-(-27.5375)));
        zz = -16.67686 + (((tickAnim - 24) / 3) * (-34.92739-(-16.67686)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 55.39764 + (((tickAnim - 27) / 3) * (70.4185-(55.39764)));
        yy = -13.99201 + (((tickAnim - 27) / 3) * (-7.89994-(-13.99201)));
        zz = -34.92739 + (((tickAnim - 27) / 3) * (-17.78576-(-34.92739)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
        xx = 70.4185 + (((tickAnim - 30) / 1) * (69.91-(70.4185)));
        yy = -7.89994 + (((tickAnim - 30) / 1) * (-10.71-(-7.89994)));
        zz = -17.78576 + (((tickAnim - 30) / 1) * (-17.63-(-17.78576)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
        xx = 69.91 + (((tickAnim - 31) / 5) * (66.87-(69.91)));
        yy = -10.71 + (((tickAnim - 31) / 5) * (-27.54-(-10.71)));
        zz = -17.63 + (((tickAnim - 31) / 5) * (-16.68-(-17.63)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegSecond1, leftLegSecond1.rotateAngleX + (float) Math.toRadians(xx), leftLegSecond1.rotateAngleY + (float) Math.toRadians(yy), leftLegSecond1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 69.91 + (((tickAnim - 0) / 5) * (66.867-(69.91)));
        yy = 10.71 + (((tickAnim - 0) / 5) * (27.5375-(10.71)));
        zz = 17.63 + (((tickAnim - 0) / 5) * (16.67686-(17.63)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 66.867 + (((tickAnim - 5) / 3) * (55.39764-(66.867)));
        yy = 27.5375 + (((tickAnim - 5) / 3) * (13.99201-(27.5375)));
        zz = 16.67686 + (((tickAnim - 5) / 3) * (34.92739-(16.67686)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 55.39764 + (((tickAnim - 8) / 3) * (70.4185-(55.39764)));
        yy = 13.99201 + (((tickAnim - 8) / 3) * (7.89994-(13.99201)));
        zz = 34.92739 + (((tickAnim - 8) / 3) * (17.78576-(34.92739)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
        xx = 70.4185 + (((tickAnim - 11) / 6) * (66.867-(70.4185)));
        yy = 7.89994 + (((tickAnim - 11) / 6) * (27.5375-(7.89994)));
        zz = 17.78576 + (((tickAnim - 11) / 6) * (16.67686-(17.78576)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
        xx = 66.867 + (((tickAnim - 17) / 3) * (55.39764-(66.867)));
        yy = 27.5375 + (((tickAnim - 17) / 3) * (13.99201-(27.5375)));
        zz = 16.67686 + (((tickAnim - 17) / 3) * (34.92739-(16.67686)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
        xx = 55.39764 + (((tickAnim - 20) / 3) * (70.4185-(55.39764)));
        yy = 13.99201 + (((tickAnim - 20) / 3) * (7.89994-(13.99201)));
        zz = 34.92739 + (((tickAnim - 20) / 3) * (17.78576-(34.92739)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
        xx = 70.4185 + (((tickAnim - 23) / 6) * (66.867-(70.4185)));
        yy = 7.89994 + (((tickAnim - 23) / 6) * (27.5375-(7.89994)));
        zz = 17.78576 + (((tickAnim - 23) / 6) * (16.67686-(17.78576)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
        xx = 66.867 + (((tickAnim - 29) / 3) * (55.39764-(66.867)));
        yy = 27.5375 + (((tickAnim - 29) / 3) * (13.99201-(27.5375)));
        zz = 16.67686 + (((tickAnim - 29) / 3) * (34.92739-(16.67686)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
        xx = 55.39764 + (((tickAnim - 32) / 3) * (70.4185-(55.39764)));
        yy = 13.99201 + (((tickAnim - 32) / 3) * (7.89994-(13.99201)));
        zz = 34.92739 + (((tickAnim - 32) / 3) * (17.78576-(34.92739)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
        xx = 70.4185 + (((tickAnim - 35) / 1) * (69.91-(70.4185)));
        yy = 7.89994 + (((tickAnim - 35) / 1) * (10.71-(7.89994)));
        zz = 17.78576 + (((tickAnim - 35) / 1) * (17.63-(17.78576)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegSecond1, rightLegSecond1.rotateAngleX + (float) Math.toRadians(xx), rightLegSecond1.rotateAngleY + (float) Math.toRadians(yy), rightLegSecond1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 44.08 + (((tickAnim - 0) / 5) * (47.51382-(44.08)));
        yy = -27.2 + (((tickAnim - 0) / 5) * (-49.20161-(-27.2)));
        zz = -21.31 + (((tickAnim - 0) / 5) * (-16.63631-(-21.31)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 47.51382 + (((tickAnim - 5) / 3) * (49.61622-(47.51382)));
        yy = -49.20161 + (((tickAnim - 5) / 3) * (-35.51718-(-49.20161)));
        zz = -16.63631 + (((tickAnim - 5) / 3) * (-40.66976-(-16.63631)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 49.61622 + (((tickAnim - 8) / 3) * (43.50945-(49.61622)));
        yy = -35.51718 + (((tickAnim - 8) / 3) * (-23.53037-(-35.51718)));
        zz = -40.66976 + (((tickAnim - 8) / 3) * (-22.0868-(-40.66976)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
        xx = 43.50945 + (((tickAnim - 11) / 7) * (47.51382-(43.50945)));
        yy = -23.53037 + (((tickAnim - 11) / 7) * (-49.20161-(-23.53037)));
        zz = -22.0868 + (((tickAnim - 11) / 7) * (-16.63631-(-22.0868)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = 47.51382 + (((tickAnim - 18) / 2) * (49.61622-(47.51382)));
        yy = -49.20161 + (((tickAnim - 18) / 2) * (-35.51718-(-49.20161)));
        zz = -16.63631 + (((tickAnim - 18) / 2) * (-40.66976-(-16.63631)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
        xx = 49.61622 + (((tickAnim - 20) / 3) * (43.50945-(49.61622)));
        yy = -35.51718 + (((tickAnim - 20) / 3) * (-23.53037-(-35.51718)));
        zz = -40.66976 + (((tickAnim - 20) / 3) * (-22.0868-(-40.66976)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
        xx = 43.50945 + (((tickAnim - 23) / 6) * (47.51382-(43.50945)));
        yy = -23.53037 + (((tickAnim - 23) / 6) * (-49.20161-(-23.53037)));
        zz = -22.0868 + (((tickAnim - 23) / 6) * (-16.63631-(-22.0868)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
        xx = 47.51382 + (((tickAnim - 29) / 2) * (48.57-(47.51382)));
        yy = -49.20161 + (((tickAnim - 29) / 2) * (-42.36-(-49.20161)));
        zz = -16.63631 + (((tickAnim - 29) / 2) * (-28.65-(-16.63631)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
        xx = 48.57 + (((tickAnim - 31) / 2) * (49.61622-(48.57)));
        yy = -42.36 + (((tickAnim - 31) / 2) * (-35.51718-(-42.36)));
        zz = -28.65 + (((tickAnim - 31) / 2) * (-40.66976-(-28.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
        xx = 49.61622 + (((tickAnim - 33) / 2) * (43.50945-(49.61622)));
        yy = -35.51718 + (((tickAnim - 33) / 2) * (-23.53037-(-35.51718)));
        zz = -40.66976 + (((tickAnim - 33) / 2) * (-22.0868-(-40.66976)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
        xx = 43.50945 + (((tickAnim - 35) / 1) * (44.08-(43.50945)));
        yy = -23.53037 + (((tickAnim - 35) / 1) * (-27.2-(-23.53037)));
        zz = -22.0868 + (((tickAnim - 35) / 1) * (-21.31-(-22.0868)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegThird1, leftLegThird1.rotateAngleX + (float) Math.toRadians(xx), leftLegThird1.rotateAngleY + (float) Math.toRadians(yy), leftLegThird1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 2) {
        xx = 48.57 + (((tickAnim - 0) / 2) * (49.61622-(48.57)));
        yy = 42.36 + (((tickAnim - 0) / 2) * (35.51718-(42.36)));
        zz = 28.65 + (((tickAnim - 0) / 2) * (40.66976-(28.65)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
        xx = 49.61622 + (((tickAnim - 2) / 2) * (43.50945-(49.61622)));
        yy = 35.51718 + (((tickAnim - 2) / 2) * (23.53037-(35.51718)));
        zz = 40.66976 + (((tickAnim - 2) / 2) * (22.0868-(40.66976)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
        xx = 43.50945 + (((tickAnim - 4) / 6) * (47.51382-(43.50945)));
        yy = 23.53037 + (((tickAnim - 4) / 6) * (49.20161-(23.53037)));
        zz = 22.0868 + (((tickAnim - 4) / 6) * (16.63631-(22.0868)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 47.51382 + (((tickAnim - 10) / 3) * (49.61622-(47.51382)));
        yy = 49.20161 + (((tickAnim - 10) / 3) * (35.51718-(49.20161)));
        zz = 16.63631 + (((tickAnim - 10) / 3) * (40.66976-(16.63631)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 49.61622 + (((tickAnim - 13) / 3) * (43.50945-(49.61622)));
        yy = 35.51718 + (((tickAnim - 13) / 3) * (23.53037-(35.51718)));
        zz = 40.66976 + (((tickAnim - 13) / 3) * (22.0868-(40.66976)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
        xx = 43.50945 + (((tickAnim - 16) / 7) * (47.51382-(43.50945)));
        yy = 23.53037 + (((tickAnim - 16) / 7) * (49.20161-(23.53037)));
        zz = 22.0868 + (((tickAnim - 16) / 7) * (16.63631-(22.0868)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
        xx = 47.51382 + (((tickAnim - 23) / 2) * (49.61622-(47.51382)));
        yy = 49.20161 + (((tickAnim - 23) / 2) * (35.51718-(49.20161)));
        zz = 16.63631 + (((tickAnim - 23) / 2) * (40.66976-(16.63631)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
        xx = 49.61622 + (((tickAnim - 25) / 3) * (43.50945-(49.61622)));
        yy = 35.51718 + (((tickAnim - 25) / 3) * (23.53037-(35.51718)));
        zz = 40.66976 + (((tickAnim - 25) / 3) * (22.0868-(40.66976)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
        xx = 43.50945 + (((tickAnim - 28) / 6) * (47.51382-(43.50945)));
        yy = 23.53037 + (((tickAnim - 28) / 6) * (49.20161-(23.53037)));
        zz = 22.0868 + (((tickAnim - 28) / 6) * (16.63631-(22.0868)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
        xx = 47.51382 + (((tickAnim - 34) / 2) * (48.57-(47.51382)));
        yy = 49.20161 + (((tickAnim - 34) / 2) * (42.36-(49.20161)));
        zz = 16.63631 + (((tickAnim - 34) / 2) * (28.65-(16.63631)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegThird1, rightLegThird1.rotateAngleX + (float) Math.toRadians(xx), rightLegThird1.rotateAngleY + (float) Math.toRadians(yy), rightLegThird1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftPaddle1, leftPaddle1.rotateAngleX + (float) Math.toRadians(0), leftPaddle1.rotateAngleY + (float) Math.toRadians(-40), leftPaddle1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightPaddle1, rightPaddle1.rotateAngleX + (float) Math.toRadians(0), rightPaddle1.rotateAngleY + (float) Math.toRadians(40), rightPaddle1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60))*2), body1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*2))*2), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-12.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3+60))*0.6), body2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*3))*2), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-2.5), tail1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*4))*4), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*5))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(8-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2))*4), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*6))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60))*4), tail4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*6))*4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60*7))*2), telson.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*7))*4), telson.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraRhinocarcinosoma entity = (EntityPrehistoricFloraRhinocarcinosoma) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Rhinocarcinosoma, Rhinocarcinosoma.rotateAngleX + (float) Math.toRadians(4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60))*2), Rhinocarcinosoma.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60))*4), Rhinocarcinosoma.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3))*3));
        this.Rhinocarcinosoma.rotationPointX = this.Rhinocarcinosoma.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200))*0.2);
        this.Rhinocarcinosoma.rotationPointY = this.Rhinocarcinosoma.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3+60))*0.1);
        this.Rhinocarcinosoma.rotationPointZ = this.Rhinocarcinosoma.rotationPointZ + (float)(0);


        this.setRotateAngle(leftPedipalp, leftPedipalp.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3-60))*5), leftPedipalp.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*8-60))*3), leftPedipalp.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*6-60))*10));


        this.setRotateAngle(rightPedipalp, rightPedipalp.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3))*5), rightPedipalp.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*8))*3), rightPedipalp.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*6))*10));



         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 59.08 + (((tickAnim - 0) / 1) * (66.61101-(59.08)));
        yy = 9.81 + (((tickAnim - 0) / 1) * (15.61148-(9.81)));
        zz = -4.8 + (((tickAnim - 0) / 1) * (0.8544-(-4.8)));
    }
            else if (tickAnim >= 1 && tickAnim < 7) {
    xx = 66.61101 + (((tickAnim - 1) / 6) * (59.45383-(66.61101)));
    yy = 15.61148 + (((tickAnim - 1) / 6) * (-11.2519-(15.61148)));
    zz = 0.8544 + (((tickAnim - 1) / 6) * (-1.64016-(0.8544)));
}
        else if (tickAnim >= 7 && tickAnim < 10) {
        xx = 59.45383 + (((tickAnim - 7) / 3) * (44.01057-(59.45383)));
        yy = -11.2519 + (((tickAnim - 7) / 3) * (-1.79954-(-11.2519)));
        zz = -1.64016 + (((tickAnim - 7) / 3) * (-16.09791-(-1.64016)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 44.01057 + (((tickAnim - 10) / 3) * (66.61101-(44.01057)));
        yy = -1.79954 + (((tickAnim - 10) / 3) * (15.61148-(-1.79954)));
        zz = -16.09791 + (((tickAnim - 10) / 3) * (0.8544-(-16.09791)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
        xx = 66.61101 + (((tickAnim - 13) / 6) * (59.45383-(66.61101)));
        yy = 15.61148 + (((tickAnim - 13) / 6) * (-11.2519-(15.61148)));
        zz = 0.8544 + (((tickAnim - 13) / 6) * (-1.64016-(0.8544)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
        xx = 59.45383 + (((tickAnim - 19) / 3) * (44.01057-(59.45383)));
        yy = -11.2519 + (((tickAnim - 19) / 3) * (-1.79954-(-11.2519)));
        zz = -1.64016 + (((tickAnim - 19) / 3) * (-16.09791-(-1.64016)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
        xx = 44.01057 + (((tickAnim - 22) / 3) * (66.61101-(44.01057)));
        yy = -1.79954 + (((tickAnim - 22) / 3) * (15.61148-(-1.79954)));
        zz = -16.09791 + (((tickAnim - 22) / 3) * (0.8544-(-16.09791)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
        xx = 66.61101 + (((tickAnim - 25) / 6) * (59.45383-(66.61101)));
        yy = 15.61148 + (((tickAnim - 25) / 6) * (-11.2519-(15.61148)));
        zz = 0.8544 + (((tickAnim - 25) / 6) * (-1.64016-(0.8544)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
        xx = 59.45383 + (((tickAnim - 31) / 3) * (44.01057-(59.45383)));
        yy = -11.2519 + (((tickAnim - 31) / 3) * (-1.79954-(-11.2519)));
        zz = -1.64016 + (((tickAnim - 31) / 3) * (-16.09791-(-1.64016)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
        xx = 44.01057 + (((tickAnim - 34) / 2) * (59.08-(44.01057)));
        yy = -1.79954 + (((tickAnim - 34) / 2) * (9.81-(-1.79954)));
        zz = -16.09791 + (((tickAnim - 34) / 2) * (-4.8-(-16.09791)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegFirst1, leftLegFirst1.rotateAngleX + (float) Math.toRadians(xx), leftLegFirst1.rotateAngleY + (float) Math.toRadians(yy), leftLegFirst1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 59.45383 + (((tickAnim - 0) / 3) * (44.01057-(59.45383)));
        yy = 11.2519 + (((tickAnim - 0) / 3) * (1.79954-(11.2519)));
        zz = 1.64016 + (((tickAnim - 0) / 3) * (16.09791-(1.64016)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
        xx = 44.01057 + (((tickAnim - 3) / 3) * (66.61101-(44.01057)));
        yy = 1.79954 + (((tickAnim - 3) / 3) * (-15.61148-(1.79954)));
        zz = 16.09791 + (((tickAnim - 3) / 3) * (-0.8544-(16.09791)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
        xx = 66.61101 + (((tickAnim - 6) / 6) * (59.45383-(66.61101)));
        yy = -15.61148 + (((tickAnim - 6) / 6) * (11.2519-(-15.61148)));
        zz = -0.8544 + (((tickAnim - 6) / 6) * (1.64016-(-0.8544)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
        xx = 59.45383 + (((tickAnim - 12) / 3) * (44.01057-(59.45383)));
        yy = 11.2519 + (((tickAnim - 12) / 3) * (1.79954-(11.2519)));
        zz = 1.64016 + (((tickAnim - 12) / 3) * (16.09791-(1.64016)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
        xx = 44.01057 + (((tickAnim - 15) / 3) * (66.61101-(44.01057)));
        yy = 1.79954 + (((tickAnim - 15) / 3) * (-15.61148-(1.79954)));
        zz = 16.09791 + (((tickAnim - 15) / 3) * (-0.8544-(16.09791)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
        xx = 66.61101 + (((tickAnim - 18) / 6) * (59.45383-(66.61101)));
        yy = -15.61148 + (((tickAnim - 18) / 6) * (11.2519-(-15.61148)));
        zz = -0.8544 + (((tickAnim - 18) / 6) * (1.64016-(-0.8544)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
        xx = 59.45383 + (((tickAnim - 24) / 3) * (44.01057-(59.45383)));
        yy = 11.2519 + (((tickAnim - 24) / 3) * (1.79954-(11.2519)));
        zz = 1.64016 + (((tickAnim - 24) / 3) * (16.09791-(1.64016)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 44.01057 + (((tickAnim - 27) / 3) * (66.61101-(44.01057)));
        yy = 1.79954 + (((tickAnim - 27) / 3) * (-15.61148-(1.79954)));
        zz = 16.09791 + (((tickAnim - 27) / 3) * (-0.8544-(16.09791)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
        xx = 66.61101 + (((tickAnim - 30) / 6) * (59.45383-(66.61101)));
        yy = -15.61148 + (((tickAnim - 30) / 6) * (11.2519-(-15.61148)));
        zz = -0.8544 + (((tickAnim - 30) / 6) * (1.64016-(-0.8544)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegFirst1, rightLegFirst1.rotateAngleX + (float) Math.toRadians(xx), rightLegFirst1.rotateAngleY + (float) Math.toRadians(yy), rightLegFirst1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 66.87 + (((tickAnim - 0) / 3) * (55.39764-(66.87)));
        yy = -27.54 + (((tickAnim - 0) / 3) * (-13.99201-(-27.54)));
        zz = -16.68 + (((tickAnim - 0) / 3) * (-34.92739-(-16.68)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
        xx = 55.39764 + (((tickAnim - 3) / 3) * (70.4185-(55.39764)));
        yy = -13.99201 + (((tickAnim - 3) / 3) * (-7.89994-(-13.99201)));
        zz = -34.92739 + (((tickAnim - 3) / 3) * (-17.78576-(-34.92739)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
        xx = 70.4185 + (((tickAnim - 6) / 6) * (66.867-(70.4185)));
        yy = -7.89994 + (((tickAnim - 6) / 6) * (-27.5375-(-7.89994)));
        zz = -17.78576 + (((tickAnim - 6) / 6) * (-16.67686-(-17.78576)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
        xx = 66.867 + (((tickAnim - 12) / 3) * (55.39764-(66.867)));
        yy = -27.5375 + (((tickAnim - 12) / 3) * (-13.99201-(-27.5375)));
        zz = -16.67686 + (((tickAnim - 12) / 3) * (-34.92739-(-16.67686)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
        xx = 55.39764 + (((tickAnim - 15) / 3) * (70.4185-(55.39764)));
        yy = -13.99201 + (((tickAnim - 15) / 3) * (-7.89994-(-13.99201)));
        zz = -34.92739 + (((tickAnim - 15) / 3) * (-17.78576-(-34.92739)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
        xx = 70.4185 + (((tickAnim - 18) / 6) * (66.867-(70.4185)));
        yy = -7.89994 + (((tickAnim - 18) / 6) * (-27.5375-(-7.89994)));
        zz = -17.78576 + (((tickAnim - 18) / 6) * (-16.67686-(-17.78576)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
        xx = 66.867 + (((tickAnim - 24) / 3) * (55.39764-(66.867)));
        yy = -27.5375 + (((tickAnim - 24) / 3) * (-13.99201-(-27.5375)));
        zz = -16.67686 + (((tickAnim - 24) / 3) * (-34.92739-(-16.67686)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 55.39764 + (((tickAnim - 27) / 3) * (70.4185-(55.39764)));
        yy = -13.99201 + (((tickAnim - 27) / 3) * (-7.89994-(-13.99201)));
        zz = -34.92739 + (((tickAnim - 27) / 3) * (-17.78576-(-34.92739)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
        xx = 70.4185 + (((tickAnim - 30) / 1) * (69.91-(70.4185)));
        yy = -7.89994 + (((tickAnim - 30) / 1) * (-10.71-(-7.89994)));
        zz = -17.78576 + (((tickAnim - 30) / 1) * (-17.63-(-17.78576)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
        xx = 69.91 + (((tickAnim - 31) / 5) * (66.87-(69.91)));
        yy = -10.71 + (((tickAnim - 31) / 5) * (-27.54-(-10.71)));
        zz = -17.63 + (((tickAnim - 31) / 5) * (-16.68-(-17.63)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegSecond1, leftLegSecond1.rotateAngleX + (float) Math.toRadians(xx), leftLegSecond1.rotateAngleY + (float) Math.toRadians(yy), leftLegSecond1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 69.91 + (((tickAnim - 0) / 5) * (66.867-(69.91)));
        yy = 10.71 + (((tickAnim - 0) / 5) * (27.5375-(10.71)));
        zz = 17.63 + (((tickAnim - 0) / 5) * (16.67686-(17.63)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 66.867 + (((tickAnim - 5) / 3) * (55.39764-(66.867)));
        yy = 27.5375 + (((tickAnim - 5) / 3) * (13.99201-(27.5375)));
        zz = 16.67686 + (((tickAnim - 5) / 3) * (34.92739-(16.67686)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 55.39764 + (((tickAnim - 8) / 3) * (70.4185-(55.39764)));
        yy = 13.99201 + (((tickAnim - 8) / 3) * (7.89994-(13.99201)));
        zz = 34.92739 + (((tickAnim - 8) / 3) * (17.78576-(34.92739)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
        xx = 70.4185 + (((tickAnim - 11) / 6) * (66.867-(70.4185)));
        yy = 7.89994 + (((tickAnim - 11) / 6) * (27.5375-(7.89994)));
        zz = 17.78576 + (((tickAnim - 11) / 6) * (16.67686-(17.78576)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
        xx = 66.867 + (((tickAnim - 17) / 3) * (55.39764-(66.867)));
        yy = 27.5375 + (((tickAnim - 17) / 3) * (13.99201-(27.5375)));
        zz = 16.67686 + (((tickAnim - 17) / 3) * (34.92739-(16.67686)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
        xx = 55.39764 + (((tickAnim - 20) / 3) * (70.4185-(55.39764)));
        yy = 13.99201 + (((tickAnim - 20) / 3) * (7.89994-(13.99201)));
        zz = 34.92739 + (((tickAnim - 20) / 3) * (17.78576-(34.92739)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
        xx = 70.4185 + (((tickAnim - 23) / 6) * (66.867-(70.4185)));
        yy = 7.89994 + (((tickAnim - 23) / 6) * (27.5375-(7.89994)));
        zz = 17.78576 + (((tickAnim - 23) / 6) * (16.67686-(17.78576)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
        xx = 66.867 + (((tickAnim - 29) / 3) * (55.39764-(66.867)));
        yy = 27.5375 + (((tickAnim - 29) / 3) * (13.99201-(27.5375)));
        zz = 16.67686 + (((tickAnim - 29) / 3) * (34.92739-(16.67686)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
        xx = 55.39764 + (((tickAnim - 32) / 3) * (70.4185-(55.39764)));
        yy = 13.99201 + (((tickAnim - 32) / 3) * (7.89994-(13.99201)));
        zz = 34.92739 + (((tickAnim - 32) / 3) * (17.78576-(34.92739)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
        xx = 70.4185 + (((tickAnim - 35) / 1) * (69.91-(70.4185)));
        yy = 7.89994 + (((tickAnim - 35) / 1) * (10.71-(7.89994)));
        zz = 17.78576 + (((tickAnim - 35) / 1) * (17.63-(17.78576)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegSecond1, rightLegSecond1.rotateAngleX + (float) Math.toRadians(xx), rightLegSecond1.rotateAngleY + (float) Math.toRadians(yy), rightLegSecond1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 44.08 + (((tickAnim - 0) / 5) * (47.51382-(44.08)));
        yy = -27.2 + (((tickAnim - 0) / 5) * (-49.20161-(-27.2)));
        zz = -21.31 + (((tickAnim - 0) / 5) * (-16.63631-(-21.31)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 47.51382 + (((tickAnim - 5) / 3) * (49.61622-(47.51382)));
        yy = -49.20161 + (((tickAnim - 5) / 3) * (-35.51718-(-49.20161)));
        zz = -16.63631 + (((tickAnim - 5) / 3) * (-40.66976-(-16.63631)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
        xx = 49.61622 + (((tickAnim - 8) / 3) * (43.50945-(49.61622)));
        yy = -35.51718 + (((tickAnim - 8) / 3) * (-23.53037-(-35.51718)));
        zz = -40.66976 + (((tickAnim - 8) / 3) * (-22.0868-(-40.66976)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
        xx = 43.50945 + (((tickAnim - 11) / 7) * (47.51382-(43.50945)));
        yy = -23.53037 + (((tickAnim - 11) / 7) * (-49.20161-(-23.53037)));
        zz = -22.0868 + (((tickAnim - 11) / 7) * (-16.63631-(-22.0868)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = 47.51382 + (((tickAnim - 18) / 2) * (49.61622-(47.51382)));
        yy = -49.20161 + (((tickAnim - 18) / 2) * (-35.51718-(-49.20161)));
        zz = -16.63631 + (((tickAnim - 18) / 2) * (-40.66976-(-16.63631)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
        xx = 49.61622 + (((tickAnim - 20) / 3) * (43.50945-(49.61622)));
        yy = -35.51718 + (((tickAnim - 20) / 3) * (-23.53037-(-35.51718)));
        zz = -40.66976 + (((tickAnim - 20) / 3) * (-22.0868-(-40.66976)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
        xx = 43.50945 + (((tickAnim - 23) / 6) * (47.51382-(43.50945)));
        yy = -23.53037 + (((tickAnim - 23) / 6) * (-49.20161-(-23.53037)));
        zz = -22.0868 + (((tickAnim - 23) / 6) * (-16.63631-(-22.0868)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
        xx = 47.51382 + (((tickAnim - 29) / 2) * (48.57-(47.51382)));
        yy = -49.20161 + (((tickAnim - 29) / 2) * (-42.36-(-49.20161)));
        zz = -16.63631 + (((tickAnim - 29) / 2) * (-28.65-(-16.63631)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
        xx = 48.57 + (((tickAnim - 31) / 2) * (49.61622-(48.57)));
        yy = -42.36 + (((tickAnim - 31) / 2) * (-35.51718-(-42.36)));
        zz = -28.65 + (((tickAnim - 31) / 2) * (-40.66976-(-28.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
        xx = 49.61622 + (((tickAnim - 33) / 2) * (43.50945-(49.61622)));
        yy = -35.51718 + (((tickAnim - 33) / 2) * (-23.53037-(-35.51718)));
        zz = -40.66976 + (((tickAnim - 33) / 2) * (-22.0868-(-40.66976)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
        xx = 43.50945 + (((tickAnim - 35) / 1) * (44.08-(43.50945)));
        yy = -23.53037 + (((tickAnim - 35) / 1) * (-27.2-(-23.53037)));
        zz = -22.0868 + (((tickAnim - 35) / 1) * (-21.31-(-22.0868)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(leftLegThird1, leftLegThird1.rotateAngleX + (float) Math.toRadians(xx), leftLegThird1.rotateAngleY + (float) Math.toRadians(yy), leftLegThird1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 2) {
        xx = 48.57 + (((tickAnim - 0) / 2) * (49.61622-(48.57)));
        yy = 42.36 + (((tickAnim - 0) / 2) * (35.51718-(42.36)));
        zz = 28.65 + (((tickAnim - 0) / 2) * (40.66976-(28.65)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
        xx = 49.61622 + (((tickAnim - 2) / 2) * (43.50945-(49.61622)));
        yy = 35.51718 + (((tickAnim - 2) / 2) * (23.53037-(35.51718)));
        zz = 40.66976 + (((tickAnim - 2) / 2) * (22.0868-(40.66976)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
        xx = 43.50945 + (((tickAnim - 4) / 6) * (47.51382-(43.50945)));
        yy = 23.53037 + (((tickAnim - 4) / 6) * (49.20161-(23.53037)));
        zz = 22.0868 + (((tickAnim - 4) / 6) * (16.63631-(22.0868)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 47.51382 + (((tickAnim - 10) / 3) * (49.61622-(47.51382)));
        yy = 49.20161 + (((tickAnim - 10) / 3) * (35.51718-(49.20161)));
        zz = 16.63631 + (((tickAnim - 10) / 3) * (40.66976-(16.63631)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 49.61622 + (((tickAnim - 13) / 3) * (43.50945-(49.61622)));
        yy = 35.51718 + (((tickAnim - 13) / 3) * (23.53037-(35.51718)));
        zz = 40.66976 + (((tickAnim - 13) / 3) * (22.0868-(40.66976)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
        xx = 43.50945 + (((tickAnim - 16) / 7) * (47.51382-(43.50945)));
        yy = 23.53037 + (((tickAnim - 16) / 7) * (49.20161-(23.53037)));
        zz = 22.0868 + (((tickAnim - 16) / 7) * (16.63631-(22.0868)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
        xx = 47.51382 + (((tickAnim - 23) / 2) * (49.61622-(47.51382)));
        yy = 49.20161 + (((tickAnim - 23) / 2) * (35.51718-(49.20161)));
        zz = 16.63631 + (((tickAnim - 23) / 2) * (40.66976-(16.63631)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
        xx = 49.61622 + (((tickAnim - 25) / 3) * (43.50945-(49.61622)));
        yy = 35.51718 + (((tickAnim - 25) / 3) * (23.53037-(35.51718)));
        zz = 40.66976 + (((tickAnim - 25) / 3) * (22.0868-(40.66976)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
        xx = 43.50945 + (((tickAnim - 28) / 6) * (47.51382-(43.50945)));
        yy = 23.53037 + (((tickAnim - 28) / 6) * (49.20161-(23.53037)));
        zz = 22.0868 + (((tickAnim - 28) / 6) * (16.63631-(22.0868)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
        xx = 47.51382 + (((tickAnim - 34) / 2) * (48.57-(47.51382)));
        yy = 49.20161 + (((tickAnim - 34) / 2) * (42.36-(49.20161)));
        zz = 16.63631 + (((tickAnim - 34) / 2) * (28.65-(16.63631)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(rightLegThird1, rightLegThird1.rotateAngleX + (float) Math.toRadians(xx), rightLegThird1.rotateAngleY + (float) Math.toRadians(yy), rightLegThird1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftPaddle1, leftPaddle1.rotateAngleX + (float) Math.toRadians(0), leftPaddle1.rotateAngleY + (float) Math.toRadians(-40), leftPaddle1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightPaddle1, rightPaddle1.rotateAngleX + (float) Math.toRadians(0), rightPaddle1.rotateAngleY + (float) Math.toRadians(40), rightPaddle1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60))*2), body1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*2))*2), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-12.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*3+60))*0.6), body2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*3))*2), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-2.5), tail1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*4))*4), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*5))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(8-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2))*4), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*6))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60))*4), tail4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*6))*4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200*2-60*7))*2), telson.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-60*7))*4), telson.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraRhinocarcinosoma e = (EntityPrehistoricFloraRhinocarcinosoma) entity;
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
