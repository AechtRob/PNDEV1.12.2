package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEocaecilia;
import net.lepidodendron.entity.EntityPrehistoricFloraTerrestrisuchus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEocaecilia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Rightarm;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Leftarm;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Eye;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body12;
    private final AdvancedModelRenderer Body13;
    private final AdvancedModelRenderer Body14;
    private final AdvancedModelRenderer Body15;
    private final AdvancedModelRenderer Body16;
    private final AdvancedModelRenderer Leftleg;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Rightleg;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Tail;


    private ModelAnimator animator;

    public ModelEocaecilia() {
        this.textureWidth = 48;
        this.textureHeight = 40;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.4F, 10.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -18.0F);
        this.Root.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 28, 0, -1.5F, -1.5F, 0.98F, 3, 3, 7, 0.0F, false));

        this.Rightarm = new AdvancedModelRenderer(this);
        this.Rightarm.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.Body1.addChild(Rightarm);
        this.setRotateAngle(Rightarm, 0.1896F, 1.1645F, 0.1353F);
        this.Rightarm.cubeList.add(new ModelBox(Rightarm, 35, 22, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.Rightarm.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, 0.0F, 0.0F, -0.1745F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 28, 3, -2.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.Leftarm = new AdvancedModelRenderer(this);
        this.Leftarm.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.Body1.addChild(Leftarm);
        this.setRotateAngle(Leftarm, 0.1896F, -1.1645F, -0.1353F);
        this.Leftarm.cubeList.add(new ModelBox(Leftarm, 35, 22, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.Leftarm.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, 0.0F, 0.0F, 0.1745F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 28, 3, 0.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body1.addChild(Neck2);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 14, 27, -1.5F, -1.5F, -6.01F, 3, 3, 7, -0.02F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.2F, -5.75F);
        this.Neck2.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 34, -0.5F, -0.75F, -4.25F, 1, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.25F, -4.25F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, -0.0175F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -0.525F, -1.0F, 1.925F, 2, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.25F, -4.25F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2182F, 0.0175F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -1.475F, -1.0F, 1.925F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.25F, -4.25F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.48F, -0.0175F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, 0.0F, -0.99F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.25F, -4.25F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.48F, 0.0175F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -1.0F, -0.99F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.25F, -4.25F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0436F, -0.0175F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -1.175F, -1.0F, 3.45F, 2, 1, 1, -0.001F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.25F, -4.25F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0436F, 0.0175F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, -0.825F, -1.0F, 3.45F, 2, 1, 1, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.75F, -4.25F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 4, -1.5F, -0.175F, 3.2F, 3, 1, 1, -0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 0, -1.5F, -0.175F, 2.95F, 3, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.0F, -0.175F, 0.95F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.75F, -4.25F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 27, -0.5F, 0.0F, -4.25F, 1, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 36, 29, -1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, -4.25F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.48F, 0.0175F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 23, 0.0F, -0.01F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, -4.25F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.48F, -0.0175F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 23, -1.0F, -0.01F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0F, -4.25F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0436F, 0.0175F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 16, -1.175F, 0.0F, 3.45F, 2, 1, 1, -0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.0F, -4.25F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0436F, -0.0175F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 16, -0.825F, 0.0F, 3.45F, 2, 1, 1, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0F, -4.25F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2182F, 0.0175F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 0, -0.525F, 0.0F, 1.925F, 2, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.0F, -4.25F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2182F, -0.0175F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 0, -1.475F, 0.0F, 1.925F, 2, 1, 2, 0.0F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(0.625F, -0.825F, -2.25F);
        this.Head.addChild(Eye);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1855F, 0.3435F, -0.1987F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 27, -0.35F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.25F, 0.0F, 0.0F);
        this.Eye.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1855F, -0.3435F, 0.1987F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 27, -0.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.Body12 = new AdvancedModelRenderer(this);
        this.Body12.setRotationPoint(0.0F, 0.0F, 6.98F);
        this.Body1.addChild(Body12);
        this.Body12.cubeList.add(new ModelBox(Body12, 0, 23, -1.5F, -1.5F, -0.01F, 3, 3, 7, -0.01F, false));

        this.Body13 = new AdvancedModelRenderer(this);
        this.Body13.setRotationPoint(0.0F, 0.0F, 5.99F);
        this.Body12.addChild(Body13);
        this.Body13.cubeList.add(new ModelBox(Body13, 14, 16, -1.5F, -1.5F, -0.01F, 3, 3, 7, 0.0F, false));

        this.Body14 = new AdvancedModelRenderer(this);
        this.Body14.setRotationPoint(0.0F, 0.0F, 5.99F);
        this.Body13.addChild(Body14);
        this.setRotateAngle(Body14, 0.0F, 0.0F, 0.0F);
        this.Body14.cubeList.add(new ModelBox(Body14, 14, 5, -1.5F, -1.5F, -0.01F, 3, 3, 7, -0.01F, false));

        this.Body15 = new AdvancedModelRenderer(this);
        this.Body15.setRotationPoint(0.0F, 0.0F, 5.99F);
        this.Body14.addChild(Body15);
        this.Body15.cubeList.add(new ModelBox(Body15, 0, 12, -1.5F, -1.5F, -0.02F, 3, 3, 7, 0.0F, false));

        this.Body16 = new AdvancedModelRenderer(this);
        this.Body16.setRotationPoint(0.0F, 0.0F, 5.99F);
        this.Body15.addChild(Body16);
        this.Body16.cubeList.add(new ModelBox(Body16, 28, 11, -1.0F, -1.5F, -0.02F, 2, 3, 7, -0.01F, false));

        this.Leftleg = new AdvancedModelRenderer(this);
        this.Leftleg.setRotationPoint(0.5F, 1.0F, 5.06F);
        this.Body16.addChild(Leftleg);
        this.setRotateAngle(Leftleg, -0.1298F, -0.7769F, 0.1841F);
        this.Leftleg.cubeList.add(new ModelBox(Leftleg, 14, 27, 0.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(1.5F, 0.0F, -0.5F);
        this.Leftleg.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.0F, -0.5672F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 0, 27, 0.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.Rightleg = new AdvancedModelRenderer(this);
        this.Rightleg.setRotationPoint(-0.5F, 1.0F, 5.06F);
        this.Body16.addChild(Rightleg);
        this.setRotateAngle(Rightleg, -0.1298F, 0.7769F, -0.1841F);
        this.Rightleg.cubeList.add(new ModelBox(Rightleg, 14, 27, -2.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, true));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(-1.5F, 0.0F, -0.5F);
        this.Rightleg.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.0F, 0.5672F, 0.0F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 0, 27, -2.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.25F, 5.99F);
        this.Body16.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, -0.5F, -0.95F, -0.03F, 1, 2, 9, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.Root.offsetY = 0.32F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -2.0F;
        this.Root.offsetX = -1.338F;
        this.Root.rotateAngleY = (float)Math.toRadians(200);
        this.Root.rotateAngleX = (float)Math.toRadians(8);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 1.63F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        this.Root.offsetZ = -0.6F;

        EntityPrehistoricFloraEocaecilia Eocaecilia = (EntityPrehistoricFloraEocaecilia) e;

        this.faceTarget(f3, f4, 16, Head);
        AdvancedModelRenderer[] Tail = {this.Body12, this.Body13, this.Body14, this.Body15, this.Body16};
        Eocaecilia.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEocaecilia ee = (EntityPrehistoricFloraEocaecilia) entitylivingbaseIn;

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
        EntityPrehistoricFloraEocaecilia entity = (EntityPrehistoricFloraEocaecilia) entitylivingbaseIn;
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
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 3.5 + (((tickAnim - 7) / 6) * (-5.75-(3.5)));
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
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 7) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animMove(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraEocaecilia entity = (EntityPrehistoricFloraEocaecilia) entitylivingbaseIn;
        int animCycle = 30;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Rightleg, Rightleg.rotateAngleX + (float) Math.toRadians(0), Rightleg.rotateAngleY + (float) Math.toRadians(13.75), Rightleg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(0), Rightleg2.rotateAngleY + (float) Math.toRadians(-15.5), Rightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-180))*4), Root.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body1, Body1.rotateAngleX + (float) Math.toRadians(0.75), Body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-100))*5), Body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*2));
        this.Body1.rotationPointX = this.Body1.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.38))*0.1);
        this.Body1.rotationPointY = this.Body1.rotationPointY - (float)(0);
        this.Body1.rotationPointZ = this.Body1.rotationPointZ + (float)(0);
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-80))*4), Neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-230))*-8), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body12, Body12.rotateAngleX + (float) Math.toRadians(0), Body12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-190))*5), Body12.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body13, Body13.rotateAngleX + (float) Math.toRadians(0), Body13.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-230))*7), Body13.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body14, Body14.rotateAngleX + (float) Math.toRadians(0), Body14.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-280))*9), Body14.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body15, Body15.rotateAngleX + (float) Math.toRadians(0), Body15.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-350))*10), Body15.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body16, Body16.rotateAngleX + (float) Math.toRadians(0), Body16.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75+390))*13), Body16.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftleg, Leftleg.rotateAngleX + (float) Math.toRadians(0), Leftleg.rotateAngleY + (float) Math.toRadians(-18.5), Leftleg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(0), Leftleg2.rotateAngleY + (float) Math.toRadians(12.75), Leftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75+300))*25), Tail.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraEocaecilia entity = (EntityPrehistoricFloraEocaecilia) entitylivingbaseIn;
        int animCycle = 35;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.07899 + (((tickAnim - 0) / 8) * (8.36494-(-2.07899)));
            yy = -5.91316 + (((tickAnim - 0) / 8) * (-57.70777-(-5.91316)));
            zz = -7.56464 + (((tickAnim - 0) / 8) * (14.06862-(-7.56464)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 8.36494 + (((tickAnim - 8) / 9) * (-4.3524-(8.36494)));
            yy = -57.70777 + (((tickAnim - 8) / 9) * (-100.433-(-57.70777)));
            zz = 14.06862 + (((tickAnim - 8) / 9) * (-8.6022-(14.06862)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -4.3524 + (((tickAnim - 17) / 18) * (-2.07899-(-4.3524)));
            yy = -100.433 + (((tickAnim - 17) / 18) * (-5.91316-(-100.433)));
            zz = -8.6022 + (((tickAnim - 17) / 18) * (-7.56464-(-8.6022)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm, Rightarm.rotateAngleX + (float) Math.toRadians(xx), Rightarm.rotateAngleY + (float) Math.toRadians(yy), Rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -92.5 + (((tickAnim - 0) / 18) * (0-(-92.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (-0.69786-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (-50.087-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (35.4157-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -0.69786 + (((tickAnim - 27) / 8) * (0-(-0.69786)));
            yy = -50.087 + (((tickAnim - 27) / 8) * (-92.5-(-50.087)));
            zz = 35.4157 + (((tickAnim - 27) / 8) * (0-(35.4157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg, Rightleg.rotateAngleX + (float) Math.toRadians(xx), Rightleg.rotateAngleY + (float) Math.toRadians(yy), Rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -49.75 + (((tickAnim - 0) / 18) * (0-(-49.75)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-3.58683-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (20.3545-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (-11.2379-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -3.58683 + (((tickAnim - 21) / 6) * (-6.41765-(-3.58683)));
            yy = 20.3545 + (((tickAnim - 21) / 6) * (-17.6302-(20.3545)));
            zz = -11.2379 + (((tickAnim - 21) / 6) * (-25.1434-(-11.2379)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -6.41765 + (((tickAnim - 27) / 8) * (0-(-6.41765)));
            yy = -17.6302 + (((tickAnim - 27) / 8) * (-49.75-(-17.6302)));
            zz = -25.1434 + (((tickAnim - 27) / 8) * (0-(-25.1434)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -4.3524 + (((tickAnim - 0) / 18) * (-2.07899-(-4.3524)));
            yy = 100.43303 + (((tickAnim - 0) / 18) * (-5.91316-(100.43303)));
            zz = 8.6022 + (((tickAnim - 0) / 18) * (-7.56464-(8.6022)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -2.07899 + (((tickAnim - 18) / 9) * (8.36494-(-2.07899)));
            yy = -5.91316 + (((tickAnim - 18) / 9) * (57.7078-(-5.91316)));
            zz = -7.56464 + (((tickAnim - 18) / 9) * (-14.0686-(-7.56464)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 8.36494 + (((tickAnim - 27) / 8) * (-4.3524-(8.36494)));
            yy = 57.7078 + (((tickAnim - 27) / 8) * (100.43303-(57.7078)));
            zz = -14.0686 + (((tickAnim - 27) / 8) * (8.6022-(-14.0686)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm, Leftarm.rotateAngleX + (float) Math.toRadians(xx), Leftarm.rotateAngleY + (float) Math.toRadians(yy), Leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 36.5 + (((tickAnim - 0) / 18) * (0-(36.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-4.04103-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (-24.92541-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (16.58864-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -4.04103 + (((tickAnim - 21) / 6) * (5.64182-(-4.04103)));
            yy = -24.92541 + (((tickAnim - 21) / 6) * (-5.0831-(-24.92541)));
            zz = 16.58864 + (((tickAnim - 21) / 6) * (8.25315-(16.58864)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 5.64182 + (((tickAnim - 27) / 8) * (0-(5.64182)));
            yy = -5.0831 + (((tickAnim - 27) / 8) * (36.5-(-5.0831)));
            zz = 8.25315 + (((tickAnim - 27) / 8) * (0-(8.25315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.4369-180))*2), Root.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body1, Body1.rotateAngleX + (float) Math.toRadians(0.75), Body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.438-100))*-5), Body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.438))*2));
        this.Body1.rotationPointX = this.Body1.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.45))*0.1);
        this.Body1.rotationPointY = this.Body1.rotationPointY - (float)(0);
        this.Body1.rotationPointZ = this.Body1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.4114-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (25.12219-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.4078-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.4114 + (((tickAnim - 3) / 5) * (5.85501-(2.4114)));
            yy = 25.12219 + (((tickAnim - 3) / 5) * (-16.27691-(25.12219)));
            zz = -1.4078 + (((tickAnim - 3) / 5) * (-7.10834-(-1.4078)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 5.85501 + (((tickAnim - 8) / 9) * (0-(5.85501)));
            yy = -16.27691 + (((tickAnim - 8) / 9) * (-36.5-(-16.27691)));
            zz = -7.10834 + (((tickAnim - 8) / 9) * (0-(-7.10834)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            yy = -36.5 + (((tickAnim - 17) / 18) * (0-(-36.5)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.874-80))*-2), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.876-230))*-8), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body12, Body12.rotateAngleX + (float) Math.toRadians(0), Body12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-190))*4), Body12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body13, Body13.rotateAngleX + (float) Math.toRadians(0), Body13.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-230))*-6), Body13.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body14, Body14.rotateAngleX + (float) Math.toRadians(0), Body14.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-280))*-5), Body14.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body15, Body15.rotateAngleX + (float) Math.toRadians(0), Body15.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-350))*8), Body15.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body16, Body16.rotateAngleX + (float) Math.toRadians(0), Body16.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875+390))*10), Body16.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.69786-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (50.08696-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-35.41566-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.69786 + (((tickAnim - 8) / 9) * (0-(-0.69786)));
            yy = 50.08696 + (((tickAnim - 8) / 9) * (92.5-(50.08696)));
            zz = -35.41566 + (((tickAnim - 8) / 9) * (0-(-35.41566)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            yy = 92.5 + (((tickAnim - 17) / 18) * (0-(92.5)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg, Leftleg.rotateAngleX + (float) Math.toRadians(xx), Leftleg.rotateAngleY + (float) Math.toRadians(yy), Leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-3.58683-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-20.35448-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (11.23792-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.58683 + (((tickAnim - 3) / 5) * (-6.41765-(-3.58683)));
            yy = -20.35448 + (((tickAnim - 3) / 5) * (17.63021-(-20.35448)));
            zz = 11.23792 + (((tickAnim - 3) / 5) * (25.14339-(11.23792)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -6.41765 + (((tickAnim - 8) / 9) * (0-(-6.41765)));
            yy = 17.63021 + (((tickAnim - 8) / 9) * (49.75-(17.63021)));
            zz = 25.14339 + (((tickAnim - 8) / 9) * (0-(25.14339)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            yy = 49.75 + (((tickAnim - 17) / 18) * (0-(49.75)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875+430))*-10), Tail.rotateAngleZ + (float) Math.toRadians(0));


    }

    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
