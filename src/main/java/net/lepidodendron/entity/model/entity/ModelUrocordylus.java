package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraUrocordylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelUrocordylus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Urocordylus;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer ForelimbL;
    private final AdvancedModelRenderer RoelimbLjoint;
    private final AdvancedModelRenderer ForelimbR;
    private final AdvancedModelRenderer ForelimbRjoint;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer HindlimbL;
    private final AdvancedModelRenderer HindlimbLjoint;
    private final AdvancedModelRenderer HindlimbLjoint2;
    private final AdvancedModelRenderer HindlimbR;
    private final AdvancedModelRenderer hindlimbRjoint;
    private final AdvancedModelRenderer hindlimbRjoint2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;

    private ModelAnimator animator;

    public ModelUrocordylus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Urocordylus = new AdvancedModelRenderer(this);
        this.Urocordylus.setRotationPoint(0.0F, 23.0F, 9.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -3.0F, -15.0F);
        this.Urocordylus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 16, 0, -2.0F, -1.0F, 2.0F, 4, 3, 5, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 21, 36, -1.5F, -1.01F, 0.0F, 3, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -1.0F, 2.0F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 26, -2.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Body1.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 37, 15, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 32, 10, -1.5F, -1.0F, -5.0F, 3, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.51F, 0.0F, 0.2F, 1, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 33, -0.99F, 0.01F, 0.21F, 2, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, 0.51F, 0.0F, 0.2F, 1, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 7, 31, -1.49F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 16, 1, -1.4F, -0.9F, -2.0F, 0, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 16, 0, 1.4F, -0.9F, -2.0F, 0, 1, 2, 0.0F, false));

        this.ForelimbL = new AdvancedModelRenderer(this);
        this.ForelimbL.setRotationPoint(-1.5F, 1.05F, 2.6F);
        this.Body1.addChild(ForelimbL);
        this.setRotateAngle(ForelimbL, 0.0F, 0.5236F, -0.6109F);
        this.ForelimbL.cubeList.add(new ModelBox(ForelimbL, 22, 17, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.RoelimbLjoint = new AdvancedModelRenderer(this);
        this.RoelimbLjoint.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.ForelimbL.addChild(RoelimbLjoint);
        this.RoelimbLjoint.cubeList.add(new ModelBox(RoelimbLjoint, 12, 37, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.ForelimbR = new AdvancedModelRenderer(this);
        this.ForelimbR.setRotationPoint(1.5F, 1.05F, 2.6F);
        this.Body1.addChild(ForelimbR);
        this.setRotateAngle(ForelimbR, 0.0F, -0.5236F, 0.6109F);
        this.ForelimbR.cubeList.add(new ModelBox(ForelimbR, 0, 24, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.ForelimbRjoint = new AdvancedModelRenderer(this);
        this.ForelimbRjoint.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.ForelimbR.addChild(ForelimbRjoint);
        this.ForelimbRjoint.cubeList.add(new ModelBox(ForelimbRjoint, 37, 19, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -1.99F, -1.51F, 0.0F, 4, 3, 8, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 32, 5, -1.5F, -2.15F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -2.5F, 4.0F);
        this.Body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 0, -2.49F, 0.35F, 0.0F, 3, 1, 4, 0.0F, false));

        this.HindlimbL = new AdvancedModelRenderer(this);
        this.HindlimbL.setRotationPoint(-1.25F, 0.55F, 5.5F);
        this.Body2.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, 0.0F, 0.6109F, -0.6109F);
        this.HindlimbL.cubeList.add(new ModelBox(HindlimbL, 17, 26, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.HindlimbLjoint = new AdvancedModelRenderer(this);
        this.HindlimbLjoint.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.HindlimbL.addChild(HindlimbLjoint);
        this.setRotateAngle(HindlimbLjoint, 0.0F, 0.3491F, 0.0F);
        this.HindlimbLjoint.cubeList.add(new ModelBox(HindlimbLjoint, 22, 11, -2.0F, -0.51F, -0.49F, 2, 1, 1, 0.0F, false));

        this.HindlimbLjoint2 = new AdvancedModelRenderer(this);
        this.HindlimbLjoint2.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.HindlimbLjoint.addChild(HindlimbLjoint2);
        this.HindlimbLjoint2.cubeList.add(new ModelBox(HindlimbLjoint2, 0, 18, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.HindlimbR = new AdvancedModelRenderer(this);
        this.HindlimbR.setRotationPoint(1.25F, 0.75F, 5.5F);
        this.Body2.addChild(HindlimbR);
        this.setRotateAngle(HindlimbR, 0.0F, -0.6109F, 0.6109F);
        this.HindlimbR.cubeList.add(new ModelBox(HindlimbR, 29, 36, 0.0F, -0.7F, -0.5F, 2, 1, 1, 0.0F, false));

        this.hindlimbRjoint = new AdvancedModelRenderer(this);
        this.hindlimbRjoint.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.HindlimbR.addChild(hindlimbRjoint);
        this.setRotateAngle(hindlimbRjoint, 0.0F, -0.3491F, 0.0F);
        this.hindlimbRjoint.cubeList.add(new ModelBox(hindlimbRjoint, 26, 25, 0.0F, -0.71F, -0.49F, 2, 1, 1, 0.0F, false));

        this.hindlimbRjoint2 = new AdvancedModelRenderer(this);
        this.hindlimbRjoint2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.hindlimbRjoint.addChild(hindlimbRjoint2);
        this.hindlimbRjoint2.cubeList.add(new ModelBox(hindlimbRjoint2, 0, 21, 0.0F, -0.7F, -1.0F, 2, 1, 2, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body2.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 26, 17, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 28, 27, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 21, -0.01F, -2.5F, 0.0F, 0, 5, 6, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 22, 8, -1.0F, -1.51F, 0.0F, 2, 3, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 32, -0.5F, -1.5F, 0.0F, 1, 3, 5, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 18, 26, 0.0F, -2.5F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 17, 21, -0.49F, -1.51F, 0.0F, 1, 3, 7, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 10, 14, -0.01F, -2.5F, 0.0F, 0, 5, 7, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 12, 11, -0.5F, -1.0F, 0.0F, 1, 2, 8, 0.0F, false));
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 6, 0.0F, -2.0F, 0.0F, 0, 4, 8, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Tail5.addChild(Tail6);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 0, 18, -0.49F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));
        this.Tail6.cubeList.add(new ModelBox(Tail6, 0, 1, -0.01F, -1.5F, 0.0F, 0, 3, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body1.render(f5 * 0.465F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Body1.rotateAngleY = (float) Math.toRadians(90);
        this.Body1.offsetX = -0.25F;
        this.Body1.offsetZ = 0.2F;
        this.Body1.offsetY = -0.2F;
        this.Body1.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Body1.offsetY = 1.4F; //72

        EntityPrehistoricFloraUrocordylus Urocordylus = (EntityPrehistoricFloraUrocordylus) e;

        this.faceTarget(f3, f4, 4, Cephalon);

        float speed = 0.225F / 2F;
        if (Urocordylus.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};

        if (!Urocordylus.isReallyInWater()) {
            AdvancedModelRenderer[] FrontR = {this.ForelimbL, this.RoelimbLjoint};
            AdvancedModelRenderer[] FrontL = {this.ForelimbR, this.ForelimbRjoint};
            AdvancedModelRenderer[] BackR = {this.HindlimbL, this.HindlimbLjoint, this.HindlimbLjoint2};
            AdvancedModelRenderer[] BackL = {this.HindlimbR, this.hindlimbRjoint, this.hindlimbRjoint2};
            this.chainSwingExtended(FrontL, speed * 0.2F, -0.3F, -1, 0F, f2, 1);
            this.chainSwingExtended(FrontR, speed *0.2F, -0.3F, -1, 3F, f2, 1);
            this.chainSwingExtended(BackL, speed * 0.2F, -0.3F, -1, 0F, f2, 1);
            this.chainSwingExtended(BackR, speed *0.2F, -0.3F, -1, 3F, f2, 1);

        }
        else {
            speed = speed * 4F;

            //Feet:
            AdvancedModelRenderer[] FrontR = {this.ForelimbL, this.RoelimbLjoint};
            AdvancedModelRenderer[] FrontL = {this.ForelimbR, this.ForelimbRjoint};
            AdvancedModelRenderer[] BackR = {this.HindlimbL, this.HindlimbLjoint, this.HindlimbLjoint2};
            AdvancedModelRenderer[] BackL = {this.HindlimbR, this.hindlimbRjoint, this.hindlimbRjoint2};

            if (f3 == 0.0F || !Urocordylus.getIsMoving()) { //Not moving
                this.chainSwingExtended(FrontL, speed * 0.2F, -0.3F, -1, 0F, f2, 1);
                this.chainSwingExtended(FrontR, speed *0.2F, -0.3F, -1, 3F, f2, 1);
                this.chainSwingExtended(BackL, speed * 0.2F, -0.3F, -1, 0F, f2, 1);
                this.chainSwingExtended(BackR, speed *0.2F, -0.3F, -1, 3F, f2, 1);
                return;
            }

            this.setRotateAngle(ForelimbR, (float) Math.toRadians(0), (float) Math.toRadians(-70), -(float) Math.toRadians(-35));
            this.setRotateAngle(ForelimbL, -(float) Math.toRadians(0), -(float) Math.toRadians(-70), (float) Math.toRadians(-35));

            this.setRotateAngle(HindlimbR, (float) Math.toRadians(0), (float) Math.toRadians(-60), -(float) Math.toRadians(-35));
            this.setRotateAngle(HindlimbL, -(float) Math.toRadians(0), -(float) Math.toRadians(-60), (float) Math.toRadians(-35));




            this.chainWave(Tail, speed*2, 0.012F, -0.2, f2, 0.5F);
            this.chainSwing(Tail, speed*2, 0.35F, -2.8, f2, 0.5F);
            this.swing(Body1, speed, 0.2F, true, 0, 0, f2, 1);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
