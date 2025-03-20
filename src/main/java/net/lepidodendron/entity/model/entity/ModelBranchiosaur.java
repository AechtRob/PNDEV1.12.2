package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBranchiosaur;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBranchiosaur extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer gillright;
    private final AdvancedModelRenderer gillleft;
    private final AdvancedModelRenderer gillright2;
    private final AdvancedModelRenderer gillleft2;
    private final AdvancedModelRenderer gillright3;
    private final AdvancedModelRenderer gillleft3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelBranchiosaur() {
        this.textureWidth = 28;
        this.textureHeight = 24;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.base.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 12, 8, -1.0F, -2.5F, -1.25F, 2, 2, 3, 0.01F, false));
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, 0.0F, -3.5F, -0.25F, 0, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.0F, -7.3F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 0, -0.5F, -1.5F, 6.0F, 2, 1, 3, 0.0F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-0.75F, -1.35F, 1.0F);
        this.hips.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.0F, 0.3491F, -0.1309F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 10, 20, -1.75F, -0.25F, -0.25F, 2, 1, 1, 0.0F, false));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(-1.75F, 0.25F, 0.55F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.0F, 0.6545F, 0.0F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(-0.25F, 0.25F, 0.0F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, 0.0F, -0.3491F, 0.0F);
        this.footright.cubeList.add(new ModelBox(footright, 5, 7, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(0.75F, -1.35F, 1.0F);
        this.hips.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.0F, -0.3491F, 0.1309F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 10, 20, -0.25F, -0.25F, -0.25F, 2, 1, 1, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(1.75F, 0.25F, 0.55F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.0F, -0.6545F, 0.0F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.01F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(0.25F, 0.25F, 0.0F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, 0.0F, 0.3491F, 0.0F);
        this.footleft.cubeList.add(new ModelBox(footleft, 5, 7, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 1.75F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 10, 0.0F, -1.5F, 0.0F, 0, 1, 3, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 1, 0.0F, 0.5F, 1.0F, 0, 1, 2, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 7, -0.5F, -0.75F, -1.0F, 1, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 6, 5, 0.0F, 0.75F, 0.0F, 0, 1, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 15, 0.0F, -1.65F, 0.0F, 0, 2, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -0.5F, -0.25F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 5, 0.0F, -1.35F, 0.0F, 0, 3, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 7, 0.0F, -0.85F, 2.0F, 0, 2, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, 0.0F, -0.35F, 3.0F, 0, 1, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -3.35F, -4.0F, 3, 3, 4, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.2F, -0.25F, 0.5F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 15, -2.0F, -2.3F, -3.0F, 1, 2, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.2F, -0.25F, 0.5F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 15, 1.0F, -2.3F, -3.0F, 1, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -2.0F, 0.25F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, 0.0F, -1.3F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.25F, 0.25F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 13, 0.0F, -2.3F, -3.0F, 2, 2, 3, 0.0F, false));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-1.25F, -1.5F, -1.0F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, 0.0F, 0.1309F, -0.3491F);
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 20, 13, -1.75F, -0.25F, -0.25F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, 0.25F, 0.75F);
        this.upperarmright.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 0, -1.25F, 0.0F, -0.9F, 1, 0, 1, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(1.25F, -1.5F, -1.0F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 0.0F, -0.1309F, 0.3491F);
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 20, 13, -0.25F, -0.25F, -0.25F, 2, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, 0.25F, 0.75F);
        this.upperarmleft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 0, 0.25F, 0.0F, -0.9F, 1, 0, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, -2.25F);
        this.chest.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 10, 3, -0.5F, -1.0F, -4.0F, 1, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.525F, 1.0F, -4.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 20, -1.0F, -2.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.6F, 0.0F, -5.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 7, -0.25F, -1.0F, 3.0F, 2, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.525F, 1.0F, -4.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 20, 0.0F, -2.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.85F, -2.4F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3054F, -0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 14, -0.0945F, -0.25F, -0.6743F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.85F, -2.4F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3054F, 0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 14, -0.9055F, -0.25F, -0.6743F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.6F, 0.0F, -5.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 7, -1.75F, -1.0F, 3.0F, 2, 1, 2, 0.0F, false));

        this.gillright = new AdvancedModelRenderer(this);
        this.gillright.setRotationPoint(-1.5F, -0.25F, -0.25F);
        this.head.addChild(gillright);
        this.setRotateAngle(gillright, 0.0F, 0.1309F, 0.3491F);
        this.gillright.cubeList.add(new ModelBox(gillright, 5, 10, -1.25F, 0.0F, -0.25F, 2, 0, 1, 0.0F, false));

        this.gillleft = new AdvancedModelRenderer(this);
        this.gillleft.setRotationPoint(1.5F, -0.25F, -0.25F);
        this.head.addChild(gillleft);
        this.setRotateAngle(gillleft, 0.0F, -0.1309F, -0.3491F);
        this.gillleft.cubeList.add(new ModelBox(gillleft, 5, 10, -0.75F, 0.0F, -0.25F, 2, 0, 1, 0.0F, true));

        this.gillright2 = new AdvancedModelRenderer(this);
        this.gillright2.setRotationPoint(-1.0F, 0.25F, -0.6F);
        this.head.addChild(gillright2);
        this.setRotateAngle(gillright2, 0.0F, 0.3927F, 0.2618F);
        this.gillright2.cubeList.add(new ModelBox(gillright2, 5, 9, -1.75F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.gillleft2 = new AdvancedModelRenderer(this);
        this.gillleft2.setRotationPoint(1.0F, 0.25F, -0.6F);
        this.head.addChild(gillleft2);
        this.setRotateAngle(gillleft2, 0.0F, -0.3927F, -0.2618F);
        this.gillleft2.cubeList.add(new ModelBox(gillleft2, 5, 9, -0.25F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.gillright3 = new AdvancedModelRenderer(this);
        this.gillright3.setRotationPoint(-1.0F, 0.5F, -0.6F);
        this.head.addChild(gillright3);
        this.setRotateAngle(gillright3, 0.0F, 0.5236F, 0.1745F);
        this.gillright3.cubeList.add(new ModelBox(gillright3, 9, 3, -1.75F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.gillleft3 = new AdvancedModelRenderer(this);
        this.gillleft3.setRotationPoint(1.0F, 0.5F, -0.6F);
        this.head.addChild(gillleft3);
        this.setRotateAngle(gillleft3, 0.0F, -0.5236F, -0.1745F);
        this.gillleft3.cubeList.add(new ModelBox(gillleft3, 9, 3, -0.25F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.1F, -0.15F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 6, 9, 0.0F, -0.25F, -3.75F, 1, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 3.2F, 5.55F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1833F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 0, -1.0F, -2.0F, -8.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 1.75F, -3.725F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.5236F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 18, -1.0F, -2.0F, 0.0F, 1, 1, 2, -0.02F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.1F, 0.75F, -4.75F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1309F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 4, -0.25F, -1.0F, 3.0F, 2, 1, 2, 0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.75F, -3.725F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.5236F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 18, 0.0F, -2.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.1F, 0.75F, -4.75F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 4, -1.75F, -1.0F, 3.0F, 2, 1, 2, 0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
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
        this.base.offsetY = -2.0F;
        this.base.offsetX = 0.15F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 5.5F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.5F, 3.8F, -0.2F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.1F, 0.0F);
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

        EntityPrehistoricFloraBranchiosaur entitySilesaurus = (EntityPrehistoricFloraBranchiosaur) e;

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
        EntityPrehistoricFloraBranchiosaur ee = (EntityPrehistoricFloraBranchiosaur) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }


    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBranchiosaur entity = (EntityPrehistoricFloraBranchiosaur) entitylivingbaseIn;
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
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(0), upperarmright.rotateAngleY + (float) Math.toRadians(40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmright.rotateAngleZ + (float) Math.toRadians(10));
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(0), upperarmleft.rotateAngleY + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmleft.rotateAngleZ + (float) Math.toRadians(-10));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+190))*10), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(20), upperlegleft.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegleft.rotateAngleZ + (float) Math.toRadians(20));
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(0), lowerlegleft.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), lowerlegleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footleft.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*20), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*5));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-220))*1.5);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBranchiosaur entity = (EntityPrehistoricFloraBranchiosaur) entitylivingbaseIn;
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
        EntityPrehistoricFloraBranchiosaur e = (EntityPrehistoricFloraBranchiosaur) entity;
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
