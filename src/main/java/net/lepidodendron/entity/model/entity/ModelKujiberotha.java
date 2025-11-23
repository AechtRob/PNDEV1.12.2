package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKujiberotha;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKujiberotha extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer forewingleft;
    private final AdvancedModelRenderer forewingright;
    private final AdvancedModelRenderer hindwingleft;
    private final AdvancedModelRenderer hindwingright;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer belly;

    private ModelAnimator animator;

    public ModelKujiberotha() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.25F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 4, -0.5F, -1.0F, -1.0F, 1, 1, 3, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 17, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.forewingleft = new AdvancedModelRenderer(this);
        this.forewingleft.setRotationPoint(0.25F, -1.0F, 0.5F);
        this.body.addChild(forewingleft);
        this.setRotateAngle(forewingleft, 0.7266F, -1.373F, 0.641F);
        this.forewingleft.cubeList.add(new ModelBox(forewingleft, 0, 0, 0.0F, 0.0F, -1.0F, 10, 0, 4, 0.0F, true));

        this.forewingright = new AdvancedModelRenderer(this);
        this.forewingright.setRotationPoint(-0.25F, -1.0F, 0.5F);
        this.body.addChild(forewingright);
        this.setRotateAngle(forewingright, 0.7266F, 1.373F, -0.641F);
        this.forewingright.cubeList.add(new ModelBox(forewingright, 0, 0, -10.0F, 0.0F, -1.0F, 10, 0, 4, 0.0F, false));

        this.hindwingleft = new AdvancedModelRenderer(this);
        this.hindwingleft.setRotationPoint(0.25F, -0.9F, 1.0F);
        this.body.addChild(hindwingleft);
        this.setRotateAngle(hindwingleft, 0.7751F, -1.3886F, 0.5844F);
        this.hindwingleft.cubeList.add(new ModelBox(hindwingleft, 0, 20, 0.0F, 0.0F, -1.0F, 8, 0, 3, 0.0F, true));

        this.hindwingright = new AdvancedModelRenderer(this);
        this.hindwingright.setRotationPoint(-0.25F, -0.9F, 1.0F);
        this.body.addChild(hindwingright);
        this.setRotateAngle(hindwingright, 0.7751F, 1.3886F, -0.5844F);
        this.hindwingright.cubeList.add(new ModelBox(hindwingright, 0, 20, -8.0F, 0.0F, -1.0F, 8, 0, 3, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(0.5F, -0.25F, -0.5F);
        this.body.addChild(armleft);
        this.setRotateAngle(armleft, 2.2584F, 0.3426F, 1.6105F);
        this.armleft.cubeList.add(new ModelBox(armleft, 20, 14, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, -2.8362F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 20, 15, -0.25F, 0.01F, -0.5F, 3, 0, 1, 0.0F, true));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 20, 16, -0.25F, -0.01F, -1.0F, 3, 0, 1, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(2.7F, 0.0F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.0F, 1.8762F, 0.0F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 20, 12, -0.25F, -0.02F, -1.5F, 3, 0, 2, 0.0F, true));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-0.5F, -0.25F, -0.5F);
        this.body.addChild(armright);
        this.setRotateAngle(armright, 2.2584F, -0.3426F, -1.6105F);
        this.armright.cubeList.add(new ModelBox(armright, 20, 14, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, 2.8362F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 20, 15, -2.75F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));
        this.armright2.cubeList.add(new ModelBox(armright2, 20, 16, -2.75F, -0.01F, -1.0F, 3, 0, 1, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-2.7F, 0.0F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.0F, -1.8762F, 0.0F);
        this.armright3.cubeList.add(new ModelBox(armright3, 20, 12, -2.75F, -0.02F, -1.5F, 3, 0, 2, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(0.0F, 0.35F, 0.5F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, -1.4967F, -0.4142F, 0.3296F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 10, -5.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.0F, 0.35F, 0.5F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, -1.4967F, 0.4142F, -0.3296F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 10, 0.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.25F, 0.6F, 1.25F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, -1.0321F, 0.5895F, 0.5045F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 15, -5.0F, 0.0F, -0.5F, 5, 0, 5, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.25F, 0.6F, 1.25F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, -1.0321F, -0.5895F, -0.5045F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 15, 0.0F, 0.0F, -0.5F, 5, 0, 5, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 22, 20, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 22, -0.75F, 0.0F, -1.0F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 22, -0.25F, 0.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.1F, 0.25F, -0.9F);
        this.head.addChild(antennaright);
        this.setRotateAngle(antennaright, -0.3054F, -0.6981F, -1.3526F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 0, 4, -3.5F, 0.0F, -6.0F, 4, 0, 6, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.1F, 0.25F, -0.9F);
        this.head.addChild(antennaleft);
        this.setRotateAngle(antennaleft, -0.3054F, 0.6981F, 1.3526F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 0, 4, -0.5F, 0.0F, -6.0F, 4, 0, 6, 0.0F, true));

        this.belly = new AdvancedModelRenderer(this);
        this.belly.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body.addChild(belly);
        this.setRotateAngle(belly, -0.1745F, 0.0F, 0.0F);
        this.belly.cubeList.add(new ModelBox(belly, 19, 24, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.30F;
        this.body.offsetX = -0.05F;
        this.body.rotateAngleY = (float)Math.toRadians(210);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 2.9F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraKujiberotha ee = (EntityPrehistoricFloraKujiberotha) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKujiberotha ee = (EntityPrehistoricFloraKujiberotha) entitylivingbaseIn;

        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

        }
        if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle scratch
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKujiberotha entity = (EntityPrehistoricFloraKujiberotha) entitylivingbaseIn;
        int animCycle = 46;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (-2.3-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            zz = -2.3 + (((tickAnim - 39) / 7) * (0-(-2.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 20 + (((tickAnim - 0) / 34) * (20-(20)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (25.8961-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (-24.12932-(0)));
            zz = 20 + (((tickAnim - 34) / 4) * (14.89647-(20)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 25.8961 + (((tickAnim - 38) / 0) * (10.4042-(25.8961)));
            yy = -24.12932 + (((tickAnim - 38) / 0) * (-41.28886-(-24.12932)));
            zz = 14.89647 + (((tickAnim - 38) / 0) * (-16.60483-(14.89647)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 10.4042 + (((tickAnim - 38) / 1) * (-55.03147-(10.4042)));
            yy = -41.28886 + (((tickAnim - 38) / 1) * (-50.43752-(-41.28886)));
            zz = -16.60483 + (((tickAnim - 38) / 1) * (12.36558-(-16.60483)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -55.03147 + (((tickAnim - 39) / 3) * (0-(-55.03147)));
            yy = -50.43752 + (((tickAnim - 39) / 3) * (0-(-50.43752)));
            zz = 12.36558 + (((tickAnim - 39) / 3) * (20-(12.36558)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 20 + (((tickAnim - 42) / 4) * (20-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (-60-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = -60 + (((tickAnim - 38) / 1) * (-137.5-(-60)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = -137.5 + (((tickAnim - 39) / 3) * (0-(-137.5)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (50-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 50 + (((tickAnim - 38) / 3) * (-15-(50)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = -15 + (((tickAnim - 41) / 1) * (0-(-15)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0.10612-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (36.46106-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (1.0514-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0.10612 + (((tickAnim - 39) / 7) * (0-(0.10612)));
            yy = 36.46106 + (((tickAnim - 39) / 7) * (0-(36.46106)));
            zz = 1.0514 + (((tickAnim - 39) / 7) * (0-(1.0514)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0.10612-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (-36.46106-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (-1.0514-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0.10612 + (((tickAnim - 39) / 7) * (0-(0.10612)));
            yy = -36.46106 + (((tickAnim - 39) / 7) * (0-(-36.46106)));
            zz = -1.0514 + (((tickAnim - 39) / 7) * (0-(-1.0514)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (22.21116-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (3.52339-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0.0353-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 22.21116 + (((tickAnim - 39) / 7) * (0-(22.21116)));
            yy = 3.52339 + (((tickAnim - 39) / 7) * (0-(3.52339)));
            zz = 0.0353 + (((tickAnim - 39) / 7) * (0-(0.0353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (22.21116-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (-3.52339-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (-0.0353-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 22.21116 + (((tickAnim - 39) / 7) * (0-(22.21116)));
            yy = -3.52339 + (((tickAnim - 39) / 7) * (0-(-3.52339)));
            zz = -0.0353 + (((tickAnim - 39) / 7) * (0-(-0.0353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-26.00442-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-16.19374-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (17.90011-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -26.00442 + (((tickAnim - 8) / 4) * (7.62248-(-26.00442)));
            yy = -16.19374 + (((tickAnim - 8) / 4) * (15.57228-(-16.19374)));
            zz = 17.90011 + (((tickAnim - 8) / 4) * (-9.50509-(17.90011)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 7.62248 + (((tickAnim - 12) / 2) * (7.17756-(7.62248)));
            yy = 15.57228 + (((tickAnim - 12) / 2) * (10.64963-(15.57228)));
            zz = -9.50509 + (((tickAnim - 12) / 2) * (-8.52226-(-9.50509)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 7.17756 + (((tickAnim - 14) / 3) * (-3.73586-(7.17756)));
            yy = 10.64963 + (((tickAnim - 14) / 3) * (3.28136-(10.64963)));
            zz = -8.52226 + (((tickAnim - 14) / 3) * (-6.85024-(-8.52226)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -3.73586 + (((tickAnim - 17) / 5) * (-32.39312-(-3.73586)));
            yy = 3.28136 + (((tickAnim - 17) / 5) * (-10.48576-(3.28136)));
            zz = -6.85024 + (((tickAnim - 17) / 5) * (4.08982-(-6.85024)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -32.39312 + (((tickAnim - 22) / 4) * (7.62248-(-32.39312)));
            yy = -10.48576 + (((tickAnim - 22) / 4) * (15.57228-(-10.48576)));
            zz = 4.08982 + (((tickAnim - 22) / 4) * (-9.50509-(4.08982)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 7.62248 + (((tickAnim - 26) / 1) * (7.17756-(7.62248)));
            yy = 15.57228 + (((tickAnim - 26) / 1) * (10.64963-(15.57228)));
            zz = -9.50509 + (((tickAnim - 26) / 1) * (-8.52226-(-9.50509)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 7.17756 + (((tickAnim - 27) / 3) * (-3.73586-(7.17756)));
            yy = 10.64963 + (((tickAnim - 27) / 3) * (3.28136-(10.64963)));
            zz = -8.52226 + (((tickAnim - 27) / 3) * (-6.85024-(-8.52226)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -3.73586 + (((tickAnim - 30) / 3) * (0-(-3.73586)));
            yy = 3.28136 + (((tickAnim - 30) / 3) * (0-(3.28136)));
            zz = -6.85024 + (((tickAnim - 30) / 3) * (0-(-6.85024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(xx), antennaright.rotateAngleY + (float) Math.toRadians(yy), antennaright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-26.00442-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (16.19374-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-17.90011-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -26.00442 + (((tickAnim - 5) / 4) * (7.62248-(-26.00442)));
            yy = 16.19374 + (((tickAnim - 5) / 4) * (-15.57228-(16.19374)));
            zz = -17.90011 + (((tickAnim - 5) / 4) * (9.50509-(-17.90011)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 7.62248 + (((tickAnim - 9) / 1) * (7.17756-(7.62248)));
            yy = -15.57228 + (((tickAnim - 9) / 1) * (-10.64963-(-15.57228)));
            zz = 9.50509 + (((tickAnim - 9) / 1) * (8.52226-(9.50509)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 7.17756 + (((tickAnim - 10) / 4) * (-3.73586-(7.17756)));
            yy = -10.64963 + (((tickAnim - 10) / 4) * (-3.28136-(-10.64963)));
            zz = 8.52226 + (((tickAnim - 10) / 4) * (6.85024-(8.52226)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -3.73586 + (((tickAnim - 14) / 4) * (-32.39312-(-3.73586)));
            yy = -3.28136 + (((tickAnim - 14) / 4) * (10.48576-(-3.28136)));
            zz = 6.85024 + (((tickAnim - 14) / 4) * (-4.08982-(6.85024)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -32.39312 + (((tickAnim - 18) / 4) * (7.62248-(-32.39312)));
            yy = 10.48576 + (((tickAnim - 18) / 4) * (-15.57228-(10.48576)));
            zz = -4.08982 + (((tickAnim - 18) / 4) * (9.50509-(-4.08982)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 7.62248 + (((tickAnim - 22) / 2) * (7.17756-(7.62248)));
            yy = -15.57228 + (((tickAnim - 22) / 2) * (-10.64963-(-15.57228)));
            zz = 9.50509 + (((tickAnim - 22) / 2) * (8.52226-(9.50509)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 7.17756 + (((tickAnim - 24) / 3) * (-3.73586-(7.17756)));
            yy = -10.64963 + (((tickAnim - 24) / 3) * (-3.28136-(-10.64963)));
            zz = 8.52226 + (((tickAnim - 24) / 3) * (6.85024-(8.52226)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -3.73586 + (((tickAnim - 27) / 3) * (0-(-3.73586)));
            yy = -3.28136 + (((tickAnim - 27) / 3) * (0-(-3.28136)));
            zz = 6.85024 + (((tickAnim - 27) / 3) * (0-(6.85024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(xx), antennaleft.rotateAngleY + (float) Math.toRadians(yy), antennaleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = -20 + (((tickAnim - 0) / 34) * (-20-(-20)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (25.8961-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (24.12932-(0)));
            zz = -20 + (((tickAnim - 34) / 4) * (-14.89647-(-20)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 25.8961 + (((tickAnim - 38) / 0) * (10.4042-(25.8961)));
            yy = 24.12932 + (((tickAnim - 38) / 0) * (41.28886-(24.12932)));
            zz = -14.89647 + (((tickAnim - 38) / 0) * (16.60483-(-14.89647)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 10.4042 + (((tickAnim - 38) / 1) * (-55.03147-(10.4042)));
            yy = 41.28886 + (((tickAnim - 38) / 1) * (50.43752-(41.28886)));
            zz = 16.60483 + (((tickAnim - 38) / 1) * (-12.36558-(16.60483)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -55.03147 + (((tickAnim - 39) / 3) * (0-(-55.03147)));
            yy = 50.43752 + (((tickAnim - 39) / 3) * (0-(50.43752)));
            zz = -12.36558 + (((tickAnim - 39) / 3) * (-20-(-12.36558)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = -20 + (((tickAnim - 42) / 4) * (-20-(-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (60-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = 60 + (((tickAnim - 38) / 1) * (137.5-(60)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 137.5 + (((tickAnim - 39) / 3) * (0-(137.5)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (-50-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = -50 + (((tickAnim - 38) / 3) * (15-(-50)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = 15 + (((tickAnim - 41) / 1) * (0-(15)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKujiberotha entity = (EntityPrehistoricFloraKujiberotha) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4, body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.body.rotationPointY = this.body.rotationPointY - (float)(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -41.70557 + (((tickAnim - 0) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 0) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 0) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 38.94261 + (((tickAnim - 1) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 1) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 1) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -39.33556 + (((tickAnim - 2) / 0) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 2) / 0) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 2) / 0) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -125.52057 + (((tickAnim - 2) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 2) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 2) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -41.70557 + (((tickAnim - 3) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 3) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 3) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 38.94261 + (((tickAnim - 4) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 4) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 4) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -39.33556 + (((tickAnim - 5) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 5) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 5) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -125.52057 + (((tickAnim - 6) / 0) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 6) / 0) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 6) / 0) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -41.70557 + (((tickAnim - 6) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 6) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 6) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 38.94261 + (((tickAnim - 7) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 7) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 7) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -39.33556 + (((tickAnim - 8) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 8) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 8) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -125.52057 + (((tickAnim - 9) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 9) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 9) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -41.70557 + (((tickAnim - 10) / 0) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 10) / 0) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 10) / 0) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 38.94261 + (((tickAnim - 10) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 10) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 10) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -39.33556 + (((tickAnim - 11) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 11) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 11) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -125.52057 + (((tickAnim - 12) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 12) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 12) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -41.70557 + (((tickAnim - 13) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 13) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 13) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 38.94261 + (((tickAnim - 14) / 0) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 14) / 0) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 14) / 0) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -39.33556 + (((tickAnim - 14) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 14) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 14) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -125.52057 + (((tickAnim - 15) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 15) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 15) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -41.70557 + (((tickAnim - 16) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 16) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 16) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 38.94261 + (((tickAnim - 17) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 17) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 17) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -39.33556 + (((tickAnim - 18) / 0) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 18) / 0) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 18) / 0) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -125.52057 + (((tickAnim - 18) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 18) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 18) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -41.70557 + (((tickAnim - 19) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 19) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 19) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 38.94261 + (((tickAnim - 20) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 20) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 20) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -39.33556 + (((tickAnim - 21) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 21) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 21) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -125.52057 + (((tickAnim - 22) / 0) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 22) / 0) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 22) / 0) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -41.70557 + (((tickAnim - 22) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 22) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 22) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 38.94261 + (((tickAnim - 23) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 23) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 23) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -39.33556 + (((tickAnim - 24) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 24) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 24) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -125.52057 + (((tickAnim - 25) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 25) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 25) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -41.70557 + (((tickAnim - 26) / 0) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 26) / 0) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 26) / 0) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 38.94261 + (((tickAnim - 26) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 26) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 26) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -39.33556 + (((tickAnim - 27) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 27) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 27) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -125.52057 + (((tickAnim - 28) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 28) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 28) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -41.70557 + (((tickAnim - 29) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 29) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 29) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 38.94261 + (((tickAnim - 30) / 0) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 30) / 0) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 30) / 0) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -39.33556 + (((tickAnim - 30) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 30) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 30) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -125.52057 + (((tickAnim - 31) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 31) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 31) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -41.70557 + (((tickAnim - 32) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 32) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 32) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 38.94261 + (((tickAnim - 33) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 33) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 33) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -39.33556 + (((tickAnim - 34) / 0) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 34) / 0) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 34) / 0) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -125.52057 + (((tickAnim - 34) / 1) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 34) / 1) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 34) / 1) * (-119.01467-(-41.21199)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -41.70557 + (((tickAnim - 35) / 1) * (38.94261-(-41.70557)));
            yy = 83.81984 + (((tickAnim - 35) / 1) * (92.27135-(83.81984)));
            zz = -119.01467 + (((tickAnim - 35) / 1) * (-18.7404-(-119.01467)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 38.94261 + (((tickAnim - 36) / 1) * (-39.33556-(38.94261)));
            yy = 92.27135 + (((tickAnim - 36) / 1) * (91.5113-(92.27135)));
            zz = -18.7404 + (((tickAnim - 36) / 1) * (36.59068-(-18.7404)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -39.33556 + (((tickAnim - 37) / 1) * (-125.52057-(-39.33556)));
            yy = 91.5113 + (((tickAnim - 37) / 1) * (87.66557-(91.5113)));
            zz = 36.59068 + (((tickAnim - 37) / 1) * (-41.21199-(36.59068)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -125.52057 + (((tickAnim - 38) / 0) * (-41.70557-(-125.52057)));
            yy = 87.66557 + (((tickAnim - 38) / 0) * (83.81984-(87.66557)));
            zz = -41.21199 + (((tickAnim - 38) / 0) * (-119.01467-(-41.21199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forewingleft, forewingleft.rotateAngleX + (float) Math.toRadians(xx), forewingleft.rotateAngleY + (float) Math.toRadians(yy), forewingleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -41.70557 + (((tickAnim - 0) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 0) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 0) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 38.94261 + (((tickAnim - 1) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 1) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 1) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -39.33556 + (((tickAnim - 2) / 0) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 2) / 0) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 2) / 0) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -125.52057 + (((tickAnim - 2) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 2) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 2) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -41.70557 + (((tickAnim - 3) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 3) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 3) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 38.94261 + (((tickAnim - 4) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 4) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 4) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -39.33556 + (((tickAnim - 5) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 5) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 5) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -125.52057 + (((tickAnim - 6) / 0) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 6) / 0) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 6) / 0) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -41.70557 + (((tickAnim - 6) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 6) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 6) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 38.94261 + (((tickAnim - 7) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 7) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 7) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -39.33556 + (((tickAnim - 8) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 8) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 8) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -125.52057 + (((tickAnim - 9) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 9) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 9) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -41.70557 + (((tickAnim - 10) / 0) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 10) / 0) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 10) / 0) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 38.94261 + (((tickAnim - 10) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 10) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 10) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -39.33556 + (((tickAnim - 11) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 11) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 11) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -125.52057 + (((tickAnim - 12) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 12) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 12) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -41.70557 + (((tickAnim - 13) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 13) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 13) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 38.94261 + (((tickAnim - 14) / 0) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 14) / 0) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 14) / 0) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -39.33556 + (((tickAnim - 14) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 14) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 14) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -125.52057 + (((tickAnim - 15) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 15) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 15) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -41.70557 + (((tickAnim - 16) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 16) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 16) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 38.94261 + (((tickAnim - 17) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 17) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 17) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -39.33556 + (((tickAnim - 18) / 0) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 18) / 0) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 18) / 0) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -125.52057 + (((tickAnim - 18) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 18) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 18) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -41.70557 + (((tickAnim - 19) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 19) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 19) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 38.94261 + (((tickAnim - 20) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 20) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 20) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -39.33556 + (((tickAnim - 21) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 21) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 21) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -125.52057 + (((tickAnim - 22) / 0) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 22) / 0) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 22) / 0) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -41.70557 + (((tickAnim - 22) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 22) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 22) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 38.94261 + (((tickAnim - 23) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 23) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 23) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -39.33556 + (((tickAnim - 24) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 24) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 24) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -125.52057 + (((tickAnim - 25) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 25) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 25) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -41.70557 + (((tickAnim - 26) / 0) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 26) / 0) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 26) / 0) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 38.94261 + (((tickAnim - 26) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 26) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 26) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -39.33556 + (((tickAnim - 27) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 27) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 27) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -125.52057 + (((tickAnim - 28) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 28) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 28) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -41.70557 + (((tickAnim - 29) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 29) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 29) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 38.94261 + (((tickAnim - 30) / 0) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 30) / 0) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 30) / 0) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -39.33556 + (((tickAnim - 30) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 30) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 30) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -125.52057 + (((tickAnim - 31) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 31) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 31) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -41.70557 + (((tickAnim - 32) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 32) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 32) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 38.94261 + (((tickAnim - 33) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 33) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 33) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -39.33556 + (((tickAnim - 34) / 0) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 34) / 0) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 34) / 0) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -125.52057 + (((tickAnim - 34) / 1) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 34) / 1) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 34) / 1) * (119.01467-(41.21199)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -41.70557 + (((tickAnim - 35) / 1) * (38.94261-(-41.70557)));
            yy = -83.81984 + (((tickAnim - 35) / 1) * (-92.27135-(-83.81984)));
            zz = 119.01467 + (((tickAnim - 35) / 1) * (18.7404-(119.01467)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 38.94261 + (((tickAnim - 36) / 1) * (-39.33556-(38.94261)));
            yy = -92.27135 + (((tickAnim - 36) / 1) * (-91.5113-(-92.27135)));
            zz = 18.7404 + (((tickAnim - 36) / 1) * (-36.59068-(18.7404)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -39.33556 + (((tickAnim - 37) / 1) * (-125.52057-(-39.33556)));
            yy = -91.5113 + (((tickAnim - 37) / 1) * (-87.66557-(-91.5113)));
            zz = -36.59068 + (((tickAnim - 37) / 1) * (41.21199-(-36.59068)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -125.52057 + (((tickAnim - 38) / 0) * (-41.70557-(-125.52057)));
            yy = -87.66557 + (((tickAnim - 38) / 0) * (-83.81984-(-87.66557)));
            zz = 41.21199 + (((tickAnim - 38) / 0) * (119.01467-(41.21199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forewingright, forewingright.rotateAngleX + (float) Math.toRadians(xx), forewingright.rotateAngleY + (float) Math.toRadians(yy), forewingright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 313.58368 + (((tickAnim - 0) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 0) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 0) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 399.25379 + (((tickAnim - 1) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 1) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 1) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 324.92389 + (((tickAnim - 2) / 0) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 2) / 0) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 2) / 0) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 243.91434 + (((tickAnim - 2) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 2) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 2) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 313.58368 + (((tickAnim - 3) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 3) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 3) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 399.25379 + (((tickAnim - 4) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 4) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 4) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 324.92389 + (((tickAnim - 5) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 5) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 5) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 243.91434 + (((tickAnim - 6) / 0) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 6) / 0) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 6) / 0) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 313.58368 + (((tickAnim - 6) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 6) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 6) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 399.25379 + (((tickAnim - 7) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 7) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 7) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 324.92389 + (((tickAnim - 8) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 8) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 8) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 243.91434 + (((tickAnim - 9) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 9) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 9) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 313.58368 + (((tickAnim - 10) / 0) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 10) / 0) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 10) / 0) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 399.25379 + (((tickAnim - 10) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 10) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 10) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 324.92389 + (((tickAnim - 11) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 11) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 11) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 243.91434 + (((tickAnim - 12) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 12) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 12) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 313.58368 + (((tickAnim - 13) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 13) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 13) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 399.25379 + (((tickAnim - 14) / 0) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 14) / 0) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 14) / 0) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 324.92389 + (((tickAnim - 14) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 14) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 14) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 243.91434 + (((tickAnim - 15) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 15) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 15) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 313.58368 + (((tickAnim - 16) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 16) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 16) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 399.25379 + (((tickAnim - 17) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 17) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 17) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 324.92389 + (((tickAnim - 18) / 0) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 18) / 0) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 18) / 0) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 243.91434 + (((tickAnim - 18) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 18) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 18) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 313.58368 + (((tickAnim - 19) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 19) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 19) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 399.25379 + (((tickAnim - 20) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 20) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 20) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 324.92389 + (((tickAnim - 21) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 21) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 21) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 243.91434 + (((tickAnim - 22) / 0) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 22) / 0) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 22) / 0) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 313.58368 + (((tickAnim - 22) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 22) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 22) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 399.25379 + (((tickAnim - 23) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 23) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 23) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 324.92389 + (((tickAnim - 24) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 24) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 24) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 243.91434 + (((tickAnim - 25) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 25) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 25) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 313.58368 + (((tickAnim - 26) / 0) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 26) / 0) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 26) / 0) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 399.25379 + (((tickAnim - 26) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 26) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 26) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 324.92389 + (((tickAnim - 27) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 27) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 27) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 243.91434 + (((tickAnim - 28) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 28) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 28) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 313.58368 + (((tickAnim - 29) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 29) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 29) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 399.25379 + (((tickAnim - 30) / 0) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 30) / 0) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 30) / 0) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 324.92389 + (((tickAnim - 30) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 30) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 30) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 243.91434 + (((tickAnim - 31) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 31) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 31) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 313.58368 + (((tickAnim - 32) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 32) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 32) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 399.25379 + (((tickAnim - 33) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 33) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 33) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 324.92389 + (((tickAnim - 34) / 0) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 34) / 0) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 34) / 0) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 243.91434 + (((tickAnim - 34) / 1) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 34) / 1) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 34) / 1) * (-110.76051-(-8.72033)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 313.58368 + (((tickAnim - 35) / 1) * (399.25379-(313.58368)));
            yy = -304.67651 + (((tickAnim - 35) / 1) * (-304.14833-(-304.67651)));
            zz = -110.76051 + (((tickAnim - 35) / 1) * (-34.70739-(-110.76051)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 399.25379 + (((tickAnim - 36) / 1) * (324.92389-(399.25379)));
            yy = -304.14833 + (((tickAnim - 36) / 1) * (-303.62015-(-304.14833)));
            zz = -34.70739 + (((tickAnim - 36) / 1) * (41.34573-(-34.70739)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 324.92389 + (((tickAnim - 37) / 1) * (243.91434-(324.92389)));
            yy = -303.62015 + (((tickAnim - 37) / 1) * (-314.81874-(-303.62015)));
            zz = 41.34573 + (((tickAnim - 37) / 1) * (-8.72033-(41.34573)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 243.91434 + (((tickAnim - 38) / 0) * (313.58368-(243.91434)));
            yy = -314.81874 + (((tickAnim - 38) / 0) * (-304.67651-(-314.81874)));
            zz = -8.72033 + (((tickAnim - 38) / 0) * (-110.76051-(-8.72033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingleft, hindwingleft.rotateAngleX + (float) Math.toRadians(xx), hindwingleft.rotateAngleY + (float) Math.toRadians(yy), hindwingleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 313.58368 + (((tickAnim - 0) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 0) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 0) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 399.25379 + (((tickAnim - 1) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 1) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 1) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 324.92389 + (((tickAnim - 2) / 0) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 2) / 0) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 2) / 0) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 243.91434 + (((tickAnim - 2) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 2) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 2) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 313.58368 + (((tickAnim - 3) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 3) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 3) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 399.25379 + (((tickAnim - 4) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 4) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 4) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 324.92389 + (((tickAnim - 5) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 5) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 5) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 243.91434 + (((tickAnim - 6) / 0) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 6) / 0) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 6) / 0) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 313.58368 + (((tickAnim - 6) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 6) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 6) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 399.25379 + (((tickAnim - 7) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 7) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 7) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 324.92389 + (((tickAnim - 8) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 8) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 8) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 243.91434 + (((tickAnim - 9) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 9) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 9) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 313.58368 + (((tickAnim - 10) / 0) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 10) / 0) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 10) / 0) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 399.25379 + (((tickAnim - 10) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 10) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 10) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 324.92389 + (((tickAnim - 11) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 11) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 11) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 243.91434 + (((tickAnim - 12) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 12) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 12) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 313.58368 + (((tickAnim - 13) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 13) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 13) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 399.25379 + (((tickAnim - 14) / 0) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 14) / 0) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 14) / 0) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 324.92389 + (((tickAnim - 14) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 14) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 14) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 243.91434 + (((tickAnim - 15) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 15) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 15) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 313.58368 + (((tickAnim - 16) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 16) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 16) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 399.25379 + (((tickAnim - 17) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 17) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 17) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 324.92389 + (((tickAnim - 18) / 0) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 18) / 0) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 18) / 0) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 243.91434 + (((tickAnim - 18) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 18) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 18) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 313.58368 + (((tickAnim - 19) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 19) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 19) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 399.25379 + (((tickAnim - 20) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 20) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 20) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 324.92389 + (((tickAnim - 21) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 21) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 21) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 243.91434 + (((tickAnim - 22) / 0) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 22) / 0) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 22) / 0) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 313.58368 + (((tickAnim - 22) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 22) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 22) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 399.25379 + (((tickAnim - 23) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 23) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 23) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 324.92389 + (((tickAnim - 24) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 24) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 24) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 243.91434 + (((tickAnim - 25) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 25) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 25) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 313.58368 + (((tickAnim - 26) / 0) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 26) / 0) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 26) / 0) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 399.25379 + (((tickAnim - 26) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 26) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 26) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 324.92389 + (((tickAnim - 27) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 27) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 27) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 243.91434 + (((tickAnim - 28) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 28) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 28) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 313.58368 + (((tickAnim - 29) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 29) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 29) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 399.25379 + (((tickAnim - 30) / 0) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 30) / 0) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 30) / 0) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 324.92389 + (((tickAnim - 30) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 30) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 30) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 243.91434 + (((tickAnim - 31) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 31) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 31) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 313.58368 + (((tickAnim - 32) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 32) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 32) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 399.25379 + (((tickAnim - 33) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 33) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 33) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 324.92389 + (((tickAnim - 34) / 0) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 34) / 0) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 34) / 0) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 243.91434 + (((tickAnim - 34) / 1) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 34) / 1) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 34) / 1) * (110.76051-(8.72033)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 313.58368 + (((tickAnim - 35) / 1) * (399.25379-(313.58368)));
            yy = 304.67651 + (((tickAnim - 35) / 1) * (304.14833-(304.67651)));
            zz = 110.76051 + (((tickAnim - 35) / 1) * (34.70739-(110.76051)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 399.25379 + (((tickAnim - 36) / 1) * (324.92389-(399.25379)));
            yy = 304.14833 + (((tickAnim - 36) / 1) * (303.62015-(304.14833)));
            zz = 34.70739 + (((tickAnim - 36) / 1) * (-41.34573-(34.70739)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 324.92389 + (((tickAnim - 37) / 1) * (243.91434-(324.92389)));
            yy = 303.62015 + (((tickAnim - 37) / 1) * (314.81874-(303.62015)));
            zz = -41.34573 + (((tickAnim - 37) / 1) * (8.72033-(-41.34573)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 243.91434 + (((tickAnim - 38) / 0) * (313.58368-(243.91434)));
            yy = 314.81874 + (((tickAnim - 38) / 0) * (304.67651-(314.81874)));
            zz = 8.72033 + (((tickAnim - 38) / 0) * (110.76051-(8.72033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingright, hindwingright.rotateAngleX + (float) Math.toRadians(xx), hindwingright.rotateAngleY + (float) Math.toRadians(yy), hindwingright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(33.27482), armright.rotateAngleY + (float) Math.toRadians(35.26672), armright.rotateAngleZ + (float) Math.toRadians(4.3487+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*5);


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0), armright2.rotateAngleY + (float) Math.toRadians(-17.5), armright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(4.7187+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+80))*6, legright.rotateAngleY + (float) Math.toRadians(88.29071), legright.rotateAngleZ + (float) Math.toRadians(5.81912));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(4.7187+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, legleft.rotateAngleY + (float) Math.toRadians(-88.29071), legleft.rotateAngleZ + (float) Math.toRadians(-5.81912));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(8.9036+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+130))*4, legright2.rotateAngleY + (float) Math.toRadians(39.07713), legright2.rotateAngleZ + (float) Math.toRadians(28.70564));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(8.9036+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*4, legleft2.rotateAngleY + (float) Math.toRadians(-39.07713), legleft2.rotateAngleZ + (float) Math.toRadians(-28.70564));


        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374-120))*6), antennaright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374-120))*6), antennaright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374))*6), antennaleft.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374-120))*6), antennaleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(33.27482), armleft.rotateAngleY + (float) Math.toRadians(-35.26672), armleft.rotateAngleZ + (float) Math.toRadians(-4.3487+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*5);


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(17.5), armleft2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraInsectFlyingBase e = (EntityPrehistoricFloraInsectFlyingBase) entity;
        animator.update(entity);
        //N/A
    }

}
