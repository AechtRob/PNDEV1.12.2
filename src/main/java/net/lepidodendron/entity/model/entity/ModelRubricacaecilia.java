package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRubricacaecilia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRubricacaecilia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;


    private ModelAnimator animator;

    public ModelRubricacaecilia() {
        this.textureWidth = 40;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.875F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, -4.75F, 2, 2, 5, 0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-1.0F, 0.1F, -4.25F);
        this.body.addChild(armright);
        this.setRotateAngle(armright, 0.0436F, 0.2618F, -0.5934F);
        this.armright.cubeList.add(new ModelBox(armright, 28, 7, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.775F, 0.025F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -0.1745F, -0.3927F, 0.6109F);
        this.armright2.cubeList.add(new ModelBox(armright2, 28, 29, -0.75F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(1.0F, 0.1F, -4.25F);
        this.body.addChild(armleft);
        this.setRotateAngle(armleft, 0.0436F, -0.2618F, 0.5934F);
        this.armleft.cubeList.add(new ModelBox(armleft, 28, 7, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.775F, 0.025F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.1745F, 0.3927F, -0.6109F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 28, 29, -0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 7, -1.0F, -1.0F, -0.25F, 2, 2, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 14, -1.0F, -1.0F, -0.25F, 2, 2, 5, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 14, 0, -1.0F, -1.0F, -0.25F, 2, 2, 5, 0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 14, 7, -1.0F, -1.0F, -0.25F, 2, 2, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 21, -1.0F, 0.0F, -0.25F, 2, 1, 5, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.075F, 0.75F);
        this.body6.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0611F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 21, -1.0F, -1.0F, -1.0F, 2, 1, 5, -0.02F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.0F, 0.1F, 4.2F);
        this.body6.addChild(legright);
        this.setRotateAngle(legright, 0.0436F, -0.3054F, -0.48F);
        this.legright.cubeList.add(new ModelBox(legright, 28, 9, -1.75F, -0.25F, -0.5F, 2, 1, 1, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.65F, 0.3F, 0.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0873F, -0.2618F, 0.3927F);
        this.legright2.cubeList.add(new ModelBox(legright2, 28, 30, -0.85F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.0F, 0.1F, 4.2F);
        this.body6.addChild(legleft);
        this.setRotateAngle(legleft, 0.0436F, 0.3054F, 0.48F);
        this.legleft.cubeList.add(new ModelBox(legleft, 28, 9, -0.25F, -0.25F, -0.5F, 2, 1, 1, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.65F, 0.3F, 0.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0873F, 0.2618F, -0.3927F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 28, 30, -0.15F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1F, 4.5F);
        this.body6.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 14, 14, -0.5F, -0.5F, -0.25F, 1, 1, 6, -0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.4F, -4.75F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 27, -1.0F, -0.5F, -2.625F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.25F, -1.175F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 27, -1.0F, -1.0F, -1.5F, 2, 1, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 28, 0, -0.5F, -0.375F, -3.45F, 1, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 23, -0.5F, -0.375F, -0.925F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.175F, 0.625F, -1.575F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 27, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.2F, 0.625F, -0.95F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0436F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 25, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.9F, 0.625F, -2.525F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2923F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 13, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.525F, 0.625F, -3.425F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.384F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 11, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.2F, 0.625F, -0.95F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.0436F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 25, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.175F, 0.625F, -1.575F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0436F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 27, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.9F, 0.625F, -2.525F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2923F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 13, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.525F, 0.625F, -3.425F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.384F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 11, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.1F, 0.1F, -2.175F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.288F, 0.3054F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 28, 19, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.1F, 0.1F, -2.175F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.288F, -0.3054F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 28, 19, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.425F, -0.45F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 27, -0.5F, -0.3F, -2.9F, 1, 1, 3, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.7F, -0.2F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 17, -0.5F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.125F, 0.7F, -0.225F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0436F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 21, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.125F, 0.7F, -1.025F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0436F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 15, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.7F, -2.9F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3229F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 4, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.125F, 0.7F, -0.225F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, -0.0436F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 21, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.125F, 0.7F, -1.025F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.0436F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 15, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.7F, -2.9F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3229F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 4, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);

        this.body.offsetY = 0.59F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -5.0F;
        this.body.offsetX = 1.0F;
        this.body.rotateAngleY = (float)Math.toRadians(210);
        this.body.rotateAngleX = (float)Math.toRadians(28);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.5F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        this.body.offsetZ = -0.6F;

        EntityPrehistoricFloraRubricacaecilia Rubricacaecilia = (EntityPrehistoricFloraRubricacaecilia) e;

        this.faceTarget(f3, f4, 16, head);
        AdvancedModelRenderer[] Tail = {this.body3, this.body4, this.body5, this.body6, this.tail};
        Rubricacaecilia.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRubricacaecilia ee = (EntityPrehistoricFloraRubricacaecilia) entitylivingbaseIn;

        //the only animation for this is managed directly by the animation ticker:
        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsMoving()) {
                animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            } else {
                animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
            }


        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRubricacaecilia entity = (EntityPrehistoricFloraRubricacaecilia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 7) / 6) * (0-(-3)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 7) / 6) * (-5.75-(-4.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5.75 + (((tickAnim - 13) / 2) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 26.75 + (((tickAnim - 7) / 3) * (0-(26.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animMove(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraRubricacaecilia entity = (EntityPrehistoricFloraRubricacaecilia) entitylivingbaseIn;
        int animCycle = 30;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-180))*4), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-80))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-190))*5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-230))*7), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-280))*9), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-350))*10), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75+390))*13), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75+300))*25), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(69.9869), armright.rotateAngleY + (float) Math.toRadians(57.04999), armright.rotateAngleZ + (float) Math.toRadians(-2.68262));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(72.75), legright.rotateAngleY + (float) Math.toRadians(61.25), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0.38725), armright2.rotateAngleY + (float) Math.toRadians(24.21062), armright2.rotateAngleZ + (float) Math.toRadians(-51.26164));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-0.17013), legright2.rotateAngleY + (float) Math.toRadians(15.94194), legright2.rotateAngleZ + (float) Math.toRadians(-53.37324));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(69.9869), armleft.rotateAngleY + (float) Math.toRadians(-57.04999), armleft.rotateAngleZ + (float) Math.toRadians(2.68262));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0.38725), armleft2.rotateAngleY + (float) Math.toRadians(-24.21062), armleft2.rotateAngleZ + (float) Math.toRadians(51.26164));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(65.75), legleft.rotateAngleY + (float) Math.toRadians(-79), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(61.75));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraRubricacaecilia entity = (EntityPrehistoricFloraRubricacaecilia) entitylivingbaseIn;
        int animCycle = 40;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-4), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*81/0.45))*0.15);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*4), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*4), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*-4), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+200))*-2), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*4), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+300))*4), tail.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 31.25 + (((tickAnim - 0) / 10) * (4.91356-(31.25)));
            yy = 40.5 + (((tickAnim - 0) / 10) * (-21.25945-(40.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (42.07836-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.91356 + (((tickAnim - 10) / 10) * (21.5-(4.91356)));
            yy = -21.25945 + (((tickAnim - 10) / 10) * (-46-(-21.25945)));
            zz = 42.07836 + (((tickAnim - 10) / 10) * (0-(42.07836)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 21.5 + (((tickAnim - 20) / 20) * (31.25-(21.5)));
            yy = -46 + (((tickAnim - 20) / 20) * (40.5-(-46)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 17.37254 + (((tickAnim - 0) / 20) * (32.054-(17.37254)));
            yy = -30.36104 + (((tickAnim - 0) / 20) * (45.49754-(-30.36104)));
            zz = -11.74883 + (((tickAnim - 0) / 20) * (13.76498-(-11.74883)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 32.054 + (((tickAnim - 20) / 10) * (15.65436-(32.054)));
            yy = 45.49754 + (((tickAnim - 20) / 10) * (-5.29847-(45.49754)));
            zz = 13.76498 + (((tickAnim - 20) / 10) * (32.22775-(13.76498)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.65436 + (((tickAnim - 30) / 10) * (17.37254-(15.65436)));
            yy = -5.29847 + (((tickAnim - 30) / 10) * (-30.36104-(-5.29847)));
            zz = 32.22775 + (((tickAnim - 30) / 10) * (-11.74883-(32.22775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.75992-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (24.90661-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-71.25171-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0.75992 + (((tickAnim - 4) / 6) * (0-(0.75992)));
            yy = 24.90661 + (((tickAnim - 4) / 6) * (0-(24.90661)));
            zz = -71.25171 + (((tickAnim - 4) / 6) * (0-(-71.25171)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-21.48547-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (6.89653-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (12.90306-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.48547 + (((tickAnim - 30) / 10) * (0-(-21.48547)));
            yy = 6.89653 + (((tickAnim - 30) / 10) * (0-(6.89653)));
            zz = 12.90306 + (((tickAnim - 30) / 10) * (0-(12.90306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0.1-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.1 + (((tickAnim - 30) / 10) * (0-(0.1)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-24.53086-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.09321-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (6.34145-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -24.53086 + (((tickAnim - 10) / 10) * (-0.16394-(-24.53086)));
            yy = 2.09321 + (((tickAnim - 10) / 10) * (11.95615-(2.09321)));
            zz = 6.34145 + (((tickAnim - 10) / 10) * (-17.21024-(6.34145)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.16394 + (((tickAnim - 20) / 4) * (2.83941-(-0.16394)));
            yy = 11.95615 + (((tickAnim - 20) / 4) * (33.62533-(11.95615)));
            zz = -17.21024 + (((tickAnim - 20) / 4) * (-48.21745-(-17.21024)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 2.83941 + (((tickAnim - 24) / 6) * (5.17058-(2.83941)));
            yy = 33.62533 + (((tickAnim - 24) / 6) * (13.59937-(33.62533)));
            zz = -48.21745 + (((tickAnim - 24) / 6) * (-62.09152-(-48.21745)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 5.17058 + (((tickAnim - 30) / 8) * (0.08738-(5.17058)));
            yy = 13.59937 + (((tickAnim - 30) / 8) * (2.82925-(13.59937)));
            zz = -62.09152 + (((tickAnim - 30) / 8) * (-9.67578-(-62.09152)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.08738 + (((tickAnim - 38) / 2) * (0-(0.08738)));
            yy = 2.82925 + (((tickAnim - 38) / 2) * (0-(2.82925)));
            zz = -9.67578 + (((tickAnim - 38) / 2) * (0-(-9.67578)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.04-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0.17 + (((tickAnim - 3) / 7) * (0.2-(0.17)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = -0.04 + (((tickAnim - 3) / 7) * (0.1-(-0.04)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.2 + (((tickAnim - 10) / 10) * (0-(0.2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.1 + (((tickAnim - 10) / 10) * (0-(0.1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 21.5 + (((tickAnim - 0) / 20) * (31.25-(21.5)));
            yy = 46 + (((tickAnim - 0) / 20) * (-40.5-(46)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.25 + (((tickAnim - 20) / 10) * (4.91356-(31.25)));
            yy = -40.5 + (((tickAnim - 20) / 10) * (21.25945-(-40.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (-42.07836-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.91356 + (((tickAnim - 30) / 10) * (21.5-(4.91356)));
            yy = 21.25945 + (((tickAnim - 30) / 10) * (46-(21.25945)));
            zz = -42.07836 + (((tickAnim - 30) / 10) * (0-(-42.07836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-21.48547-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.89653-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12.90306-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.48547 + (((tickAnim - 10) / 10) * (0-(-21.48547)));
            yy = -6.89653 + (((tickAnim - 10) / 10) * (0-(-6.89653)));
            zz = -12.90306 + (((tickAnim - 10) / 10) * (0-(-12.90306)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0.75992-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (-24.90661-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (71.25171-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0.75992 + (((tickAnim - 24) / 6) * (0-(0.75992)));
            yy = -24.90661 + (((tickAnim - 24) / 6) * (0-(-24.90661)));
            zz = 71.25171 + (((tickAnim - 24) / 6) * (0-(71.25171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.1 + (((tickAnim - 10) / 10) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 32.054 + (((tickAnim - 0) / 10) * (15.65436-(32.054)));
            yy = -45.49754 + (((tickAnim - 0) / 10) * (5.29847-(-45.49754)));
            zz = -13.76498 + (((tickAnim - 0) / 10) * (-32.22775-(-13.76498)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.65436 + (((tickAnim - 10) / 10) * (17.37254-(15.65436)));
            yy = 5.29847 + (((tickAnim - 10) / 10) * (30.36104-(5.29847)));
            zz = -32.22775 + (((tickAnim - 10) / 10) * (11.74883-(-32.22775)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 17.37254 + (((tickAnim - 20) / 20) * (32.054-(17.37254)));
            yy = 30.36104 + (((tickAnim - 20) / 20) * (-45.49754-(30.36104)));
            zz = 11.74883 + (((tickAnim - 20) / 20) * (-13.76498-(11.74883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.16394 + (((tickAnim - 0) / 4) * (2.83941-(-0.16394)));
            yy = -11.95615 + (((tickAnim - 0) / 4) * (-33.62533-(-11.95615)));
            zz = 17.21024 + (((tickAnim - 0) / 4) * (48.21745-(17.21024)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 2.83941 + (((tickAnim - 4) / 6) * (5.17058-(2.83941)));
            yy = -33.62533 + (((tickAnim - 4) / 6) * (-13.59937-(-33.62533)));
            zz = 48.21745 + (((tickAnim - 4) / 6) * (62.09152-(48.21745)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 5.17058 + (((tickAnim - 10) / 8) * (0.08738-(5.17058)));
            yy = -13.59937 + (((tickAnim - 10) / 8) * (2.82925-(-13.59937)));
            zz = 62.09152 + (((tickAnim - 10) / 8) * (-9.67578-(62.09152)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.08738 + (((tickAnim - 18) / 2) * (0-(0.08738)));
            yy = 2.82925 + (((tickAnim - 18) / 2) * (0-(2.82925)));
            zz = -9.67578 + (((tickAnim - 18) / 2) * (0-(-9.67578)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-24.53086-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-2.09321-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-6.34145-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -24.53086 + (((tickAnim - 30) / 10) * (-0.16394-(-24.53086)));
            yy = -2.09321 + (((tickAnim - 30) / 10) * (-11.95615-(-2.09321)));
            zz = -6.34145 + (((tickAnim - 30) / 10) * (17.21024-(-6.34145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-0.17-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.04-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.17 + (((tickAnim - 23) / 7) * (0-(-0.17)));
            yy = 0.05 + (((tickAnim - 23) / 7) * (0.075-(0.05)));
            zz = -0.04 + (((tickAnim - 23) / 7) * (0-(-0.04)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 30) / 10) * (0-(0.075)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);
    }

    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
