package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTyphloesus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTyphloesus extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Mouth;
    private final AdvancedModelRenderer Foregut;
    private final AdvancedModelRenderer Radula;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tailfin;

    private ModelAnimator animator;

    public ModelTyphloesus() {
        this.textureWidth = 44;
        this.textureHeight = 33;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 20.975F, -3.75F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, 0.26F, -4.0F, 0, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 6, -2.5F, -1.25F, -5.25F, 4, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 24, -2.5F, -3.175F, -3.5F, 4, 1, 3, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.0F, -2.25F, -5.5F, 5, 1, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.75F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 13, -2.5F, 0.8F, -5.0F, 4, 1, 5, -0.01F, false));

        this.Mouth = new AdvancedModelRenderer(this);
        this.Mouth.setRotationPoint(-0.5F, -0.3037F, -3.1993F);
        this.head.addChild(Mouth);
        this.setRotateAngle(Mouth, -0.3054F, 0.0F, 0.0F);
        this.Mouth.cubeList.add(new ModelBox(Mouth, 12, 19, -1.0F, 0.1037F, -1.0507F, 2, 1, 2, 0.0F, false));

        this.Foregut = new AdvancedModelRenderer(this);
        this.Foregut.setRotationPoint(0.0F, 0.608F, -0.0639F);
        this.Mouth.addChild(Foregut);
        this.Foregut.cubeList.add(new ModelBox(Foregut, 0, 2, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Radula = new AdvancedModelRenderer(this);
        this.Radula.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.Foregut.addChild(Radula);
        this.Radula.cubeList.add(new ModelBox(Radula, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.025F, -0.25F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -3.0F, -1.975F, 0.0F, 5, 3, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -3.5F, 0.5F, 0.0F, 6, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, 0.0F, 3.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 18, -2.0F, -1.975F, -0.125F, 4, 3, 4, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 15, 0, -2.5F, 0.5F, -0.125F, 5, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(1.0F, -0.275F, 3.625F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 12, 24, -2.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 8.8F, -1.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 19, -3.0F, -7.75F, 2.5F, 4, 1, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.01F, -2.7136F, -0.9874F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1527F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 12, -2.49F, 0.925F, 1.2F, 3, 1, 4, -0.01F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(-1.0F, 0.0F, 2.5F);
        this.tail.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 20, 0.0F, -4.0F, -0.5F, 0, 4, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }
    public void renderStaticWall(float f) {
        this.head.rotateAngleX = (float) Math.toRadians(90);
        this.head.offsetY = -0.2F;
        this.head.offsetX = 0.0F;
        this.head.offsetZ = 0.03F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.08F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.10F, 0.0F);
        this.head.offsetY = -0.14F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

       //this.head.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.tail, this.tailfin};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 2, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.13F * still, -0.85, f2, 0.5F * still);
            this.swing(head, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        if (!e.isInWater()) {
            //this.head.rotateAngleZ = (float) Math.toRadians(90);
           // this.head.offsetY = 1.05F;
            this.bob(head, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTyphloesus ee = (EntityPrehistoricFloraTyphloesus) entitylivingbaseIn;
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyphloesus entity = (EntityPrehistoricFloraTyphloesus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 2D) / 1D) * (-1D-(-1D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 3D) / 2D) * (-1D-(-1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 5D) / 5D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        this.Foregut.offsetX = (float) Math.toRadians(xx);
        this.Foregut.offsetY = -(float) Math.toRadians(yy);
        this.Foregut.offsetZ = (float) Math.toRadians(zz);

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 3D) / 2D) * (-1D-(-1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 5D) / 5D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        this.Radula.offsetX = (float) Math.toRadians(xx);
        this.Radula.offsetY = -(float) Math.toRadians(yy);
        this.Radula.offsetZ = (float) Math.toRadians(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTyphloesus e = (EntityPrehistoricFloraTyphloesus) entity;
        animator.update(entity);

    }

}

