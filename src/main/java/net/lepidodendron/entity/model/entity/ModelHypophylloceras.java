package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHypophylloceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHypophylloceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Mantle_r1;
    private final AdvancedModelRenderer Mantle_r2;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer arm1a;
    private final AdvancedModelRenderer arm1b;
    private final AdvancedModelRenderer arm6a;
    private final AdvancedModelRenderer arm6b;
    private final AdvancedModelRenderer arm2a;
    private final AdvancedModelRenderer arm2b;
    private final AdvancedModelRenderer arm7a;
    private final AdvancedModelRenderer arm7b;
    private final AdvancedModelRenderer arm3a;
    private final AdvancedModelRenderer arm3b;
    private final AdvancedModelRenderer arm8a;
    private final AdvancedModelRenderer arm8b;
    private final AdvancedModelRenderer arm4a;
    private final AdvancedModelRenderer arm4b;
    private final AdvancedModelRenderer arm9a;
    private final AdvancedModelRenderer arm9b;
    private final AdvancedModelRenderer arm5a;
    private final AdvancedModelRenderer arm5b;
    private final AdvancedModelRenderer arm5b2;
    private final AdvancedModelRenderer arm5b3;
    private final AdvancedModelRenderer arm5a2;
    private final AdvancedModelRenderer arm5b4;
    private final AdvancedModelRenderer arm5b5;
    private final AdvancedModelRenderer arm5b6;
    private final AdvancedModelRenderer Shellbase;

    private ModelAnimator animator;

    public ModelHypophylloceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 19.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, 2.5F, 0.5F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 1.2984F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 31, -2.5F, -3.175F, 3.0F, 5, 8, 3, 0.01F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(-0.01F, 4.85F, 3.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 13, -2.49F, -8.0F, -5.0F, 5, 8, 5, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.6981F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 0, -1.99F, -7.0F, -6.0F, 4, 7, 6, -0.01F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6545F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 20, 12, -1.99F, -7.0F, -5.0F, 4, 7, 5, 0.01F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8727F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 20, 0, -1.49F, -6.0F, -6.0F, 3, 6, 6, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7854F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 29, 30, -1.49F, -6.0F, -4.0F, 3, 6, 4, -0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.8727F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 33, 7, -0.99F, -4.0F, -5.0F, 2, 4, 5, 0.01F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -1.0036F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 51, 38, -0.99F, -4.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.5236F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 51, 14, -0.99F, -4.0F, -3.0F, 2, 4, 3, -0.01F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -1.65F, 6.05F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.691F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 15, 24, -2.0F, 0.0F, -1.0F, 4, 5, 5, 0.0F, false));

        this.Mantle_r1 = new AdvancedModelRenderer(this);
        this.Mantle_r1.setRotationPoint(-2.8F, 1.225F, 2.575F);
        this.Mantle.addChild(Mantle_r1);
        this.setRotateAngle(Mantle_r1, 0.0464F, -0.3487F, -0.0159F);
        this.Mantle_r1.cubeList.add(new ModelBox(Mantle_r1, 15, 13, -0.7F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));
        this.Mantle_r1.cubeList.add(new ModelBox(Mantle_r1, 0, 0, -0.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.Mantle_r2 = new AdvancedModelRenderer(this);
        this.Mantle_r2.setRotationPoint(2.8F, 1.225F, 2.575F);
        this.Mantle.addChild(Mantle_r2);
        this.setRotateAngle(Mantle_r2, 0.0464F, 0.3487F, 0.0159F);
        this.Mantle_r2.cubeList.add(new ModelBox(Mantle_r2, 0, 0, -0.2F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.Mantle_r2.cubeList.add(new ModelBox(Mantle_r2, 15, 13, -1.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2122F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 33, 19, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.arm1a = new AdvancedModelRenderer(this);
        this.arm1a.setRotationPoint(-0.65F, 0.5F, 3.5F);
        this.Mantle.addChild(arm1a);
        this.setRotateAngle(arm1a, -0.2913F, -0.1321F, 0.0F);
        this.arm1a.cubeList.add(new ModelBox(arm1a, 33, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm1b = new AdvancedModelRenderer(this);
        this.arm1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm1a.addChild(arm1b);
        this.setRotateAngle(arm1b, -0.2335F, 0.1061F, 0.0F);
        this.arm1b.cubeList.add(new ModelBox(arm1b, 49, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm6a = new AdvancedModelRenderer(this);
        this.arm6a.setRotationPoint(0.65F, 0.5F, 3.5F);
        this.Mantle.addChild(arm6a);
        this.setRotateAngle(arm6a, -0.2913F, 0.1321F, 0.0F);
        this.arm6a.cubeList.add(new ModelBox(arm6a, 37, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm6b = new AdvancedModelRenderer(this);
        this.arm6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm6a.addChild(arm6b);
        this.setRotateAngle(arm6b, -0.2335F, -0.1061F, 0.0F);
        this.arm6b.cubeList.add(new ModelBox(arm6b, 44, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm2a = new AdvancedModelRenderer(this);
        this.arm2a.setRotationPoint(-1.15F, 1.25F, 3.5F);
        this.Mantle.addChild(arm2a);
        this.setRotateAngle(arm2a, -0.3786F, -0.1758F, 0.0F);
        this.arm2a.cubeList.add(new ModelBox(arm2a, 44, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm2b = new AdvancedModelRenderer(this);
        this.arm2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm2a.addChild(arm2b);
        this.setRotateAngle(arm2b, -0.2335F, 0.1061F, 0.0F);
        this.arm2b.cubeList.add(new ModelBox(arm2b, 0, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm7a = new AdvancedModelRenderer(this);
        this.arm7a.setRotationPoint(1.15F, 1.25F, 3.5F);
        this.Mantle.addChild(arm7a);
        this.setRotateAngle(arm7a, -0.3786F, 0.1758F, 0.0F);
        this.arm7a.cubeList.add(new ModelBox(arm7a, 42, 11, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm7b = new AdvancedModelRenderer(this);
        this.arm7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm7a.addChild(arm7b);
        this.setRotateAngle(arm7b, -0.2335F, -0.1061F, 0.0F);
        this.arm7b.cubeList.add(new ModelBox(arm7b, 42, 17, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm3a = new AdvancedModelRenderer(this);
        this.arm3a.setRotationPoint(-1.4F, 2.0F, 3.5F);
        this.Mantle.addChild(arm3a);
        this.setRotateAngle(arm3a, -0.4658F, -0.2194F, 0.0F);
        this.arm3a.cubeList.add(new ModelBox(arm3a, 46, 23, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm3b = new AdvancedModelRenderer(this);
        this.arm3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm3a.addChild(arm3b);
        this.setRotateAngle(arm3b, -0.2335F, 0.1061F, 0.0F);
        this.arm3b.cubeList.add(new ModelBox(arm3b, 26, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm8a = new AdvancedModelRenderer(this);
        this.arm8a.setRotationPoint(1.4F, 2.0F, 3.5F);
        this.Mantle.addChild(arm8a);
        this.setRotateAngle(arm8a, -0.4658F, 0.2194F, 0.0F);
        this.arm8a.cubeList.add(new ModelBox(arm8a, 30, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm8b = new AdvancedModelRenderer(this);
        this.arm8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm8a.addChild(arm8b);
        this.setRotateAngle(arm8b, -0.2335F, -0.1061F, 0.0F);
        this.arm8b.cubeList.add(new ModelBox(arm8b, 0, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm4a = new AdvancedModelRenderer(this);
        this.arm4a.setRotationPoint(-1.15F, 2.5F, 3.0F);
        this.Mantle.addChild(arm4a);
        this.setRotateAngle(arm4a, -0.5531F, -0.2194F, 0.0F);
        this.arm4a.cubeList.add(new ModelBox(arm4a, 7, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm4b = new AdvancedModelRenderer(this);
        this.arm4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm4a.addChild(arm4b);
        this.setRotateAngle(arm4b, -0.2335F, 0.1061F, 0.0F);
        this.arm4b.cubeList.add(new ModelBox(arm4b, 19, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm9a = new AdvancedModelRenderer(this);
        this.arm9a.setRotationPoint(1.15F, 2.5F, 3.0F);
        this.Mantle.addChild(arm9a);
        this.setRotateAngle(arm9a, -0.5531F, 0.2194F, 0.0F);
        this.arm9a.cubeList.add(new ModelBox(arm9a, 11, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm9b = new AdvancedModelRenderer(this);
        this.arm9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm9a.addChild(arm9b);
        this.setRotateAngle(arm9b, -0.2335F, -0.1061F, 0.0F);
        this.arm9b.cubeList.add(new ModelBox(arm9b, 23, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5a = new AdvancedModelRenderer(this);
        this.arm5a.setRotationPoint(-0.9F, 3.0F, 2.5F);
        this.Mantle.addChild(arm5a);
        this.setRotateAngle(arm5a, -0.6404F, -0.263F, 0.0F);
        this.arm5a.cubeList.add(new ModelBox(arm5a, 45, 32, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b = new AdvancedModelRenderer(this);
        this.arm5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5a.addChild(arm5b);
        this.setRotateAngle(arm5b, -0.2335F, 0.1061F, 0.0F);
        this.arm5b.cubeList.add(new ModelBox(arm5b, 46, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b2 = new AdvancedModelRenderer(this);
        this.arm5b2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5b.addChild(arm5b2);
        this.setRotateAngle(arm5b2, 0.1155F, 0.1061F, 0.0F);
        this.arm5b2.cubeList.add(new ModelBox(arm5b2, 39, 26, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b3 = new AdvancedModelRenderer(this);
        this.arm5b3.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.arm5b2.addChild(arm5b3);
        this.setRotateAngle(arm5b3, 0.1592F, 0.1061F, 0.0F);
        this.arm5b3.cubeList.add(new ModelBox(arm5b3, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5a2 = new AdvancedModelRenderer(this);
        this.arm5a2.setRotationPoint(0.9F, 3.0F, 2.5F);
        this.Mantle.addChild(arm5a2);
        this.setRotateAngle(arm5a2, -0.6404F, 0.263F, 0.0F);
        this.arm5a2.cubeList.add(new ModelBox(arm5a2, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b4 = new AdvancedModelRenderer(this);
        this.arm5b4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5a2.addChild(arm5b4);
        this.setRotateAngle(arm5b4, -0.2335F, -0.1061F, 0.0F);
        this.arm5b4.cubeList.add(new ModelBox(arm5b4, 38, 35, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b5 = new AdvancedModelRenderer(this);
        this.arm5b5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5b4.addChild(arm5b5);
        this.setRotateAngle(arm5b5, 0.1155F, -0.1061F, 0.0F);
        this.arm5b5.cubeList.add(new ModelBox(arm5b5, 16, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b6 = new AdvancedModelRenderer(this);
        this.arm5b6.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.arm5b5.addChild(arm5b6);
        this.setRotateAngle(arm5b6, 0.1592F, -0.1061F, 0.0F);
        this.arm5b6.cubeList.add(new ModelBox(arm5b6, 32, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Shellbase = new AdvancedModelRenderer(this);
        this.Shellbase.setRotationPoint(0.01F, 2.96F, 0.0F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.15F;
        this.root.offsetZ = -0.4F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetZ = -0.1F;
        this.root.offsetY = -0.03F;
        this.root.offsetX = -0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -1.338F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        EntityPrehistoricFloraHypophylloceras ee = (EntityPrehistoricFloraHypophylloceras) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypophylloceras entity = (EntityPrehistoricFloraHypophylloceras) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Shell1, Shell1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-20))*1.2), Shell1.rotateAngleY + (float) Math.toRadians(0), Shell1.rotateAngleZ + (float) Math.toRadians(0));
        this.Shell1.rotationPointX = this.Shell1.rotationPointX + (float)(0);
        this.Shell1.rotationPointY = this.Shell1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.625+5))*0.15);
        this.Shell1.rotationPointZ = this.Shell1.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.625+5))*0.15);
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-50))*0.3), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.623))*-0.005));
        this.Siphon.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.623))*0.08),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.623))*0.02));
        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-50))*0.5), arm1a.rotateAngleY + (float) Math.toRadians(0), arm1a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*1.5), arm1b.rotateAngleY + (float) Math.toRadians(0), arm1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-50))*0.5), arm6a.rotateAngleY + (float) Math.toRadians(0), arm6a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*1.5), arm6b.rotateAngleY + (float) Math.toRadians(0), arm6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*0.5), arm2a.rotateAngleY + (float) Math.toRadians(0), arm2a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm2b.rotateAngleY + (float) Math.toRadians(0), arm2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*0.5), arm7a.rotateAngleY + (float) Math.toRadians(0), arm7a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm7b.rotateAngleY + (float) Math.toRadians(0), arm7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209+200))*0.5), arm3a.rotateAngleY + (float) Math.toRadians(0), arm3a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm3b.rotateAngleY + (float) Math.toRadians(0), arm3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209+200))*0.5), arm8a.rotateAngleY + (float) Math.toRadians(0), arm8a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm8b.rotateAngleY + (float) Math.toRadians(0), arm8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-0.5), arm4a.rotateAngleY + (float) Math.toRadians(0), arm4a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-1.5), arm4b.rotateAngleY + (float) Math.toRadians(0), arm4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-0.5), arm9a.rotateAngleY + (float) Math.toRadians(0), arm9a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-1.5), arm9b.rotateAngleY + (float) Math.toRadians(0), arm9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-1), arm5a.rotateAngleY + (float) Math.toRadians(0), arm5a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-1.5), arm5b.rotateAngleY + (float) Math.toRadians(0), arm5b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5b2, arm5b2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-400))*-2.5), arm5b2.rotateAngleY + (float) Math.toRadians(0), arm5b2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5b3, arm5b3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-450))*-3.5), arm5b3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209))*-3), arm5b3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5a2, arm5a2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-1), arm5a2.rotateAngleY + (float) Math.toRadians(0), arm5a2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5b4, arm5b4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-1.5), arm5b4.rotateAngleY + (float) Math.toRadians(0), arm5b4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5b5, arm5b5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-400))*-2.5), arm5b5.rotateAngleY + (float) Math.toRadians(0), arm5b5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5b6, arm5b6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-450))*-3.5), arm5b6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209))*3), arm5b6.rotateAngleZ + (float) Math.toRadians(0));
      
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypophylloceras entity = (EntityPrehistoricFloraHypophylloceras) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Shell1, Shell1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-20))*3.5), Shell1.rotateAngleY + (float) Math.toRadians(0), Shell1.rotateAngleZ + (float) Math.toRadians(0));
        this.Shell1.rotationPointX = this.Shell1.rotationPointX + (float)(0);
        this.Shell1.rotationPointY = this.Shell1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.378+20))*0.2);
        this.Shell1.rotationPointZ = this.Shell1.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.376+15))*1.5);
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*1.5), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.37))*-0.009));
        this.Siphon.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.37))*0.08),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.37))*0.02));
        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm1a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm1a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm1b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*8), arm1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm6a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm6a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm6b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-8), arm6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm2a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm2a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm2b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*10), arm2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm7a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm7a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm7b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-10), arm7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm3a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm3a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm3b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*15), arm3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm8a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm8a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm8b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-15), arm8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm4a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm4a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm4b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*20), arm4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm9a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm9a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm9b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-20), arm9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-180))*-3), arm5a.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-220))*-5), arm5b.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5b2, arm5b2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5b2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-320))*-8), arm5b2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5b3, arm5b3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5b3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-370))*-12), arm5b3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5a2, arm5a2.rotateAngleX + (float) Math.toRadians(-3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5a2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-180))*3), arm5a2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5b4, arm5b4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5b4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-220))*5), arm5b4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5b5, arm5b5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5b5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-320))*8), arm5b5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5b6, arm5b6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5b6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-370))*12), arm5b6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        
    }



    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraHypophylloceras ee = (EntityPrehistoricFloraHypophylloceras) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.2F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

